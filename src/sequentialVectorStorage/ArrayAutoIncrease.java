package sequentialVectorStorage;

import java.util.Arrays;

public class ArrayAutoIncrease {
        private int arraySize = 5;
        private Student[] students = new Student[arraySize];
        private int index = 0; //first position empty

        public void assureAvailableSpace() {
            if(index == arraySize) {
                students = Arrays.copyOf(students, arraySize * 2);
            }
        }
        public void addNext(Student student) {
                assureAvailableSpace();
                this.students[index] = student;
                index++;
        }

        /* To be considered valid a position number needs to be between the array first position (0) and
        the array size minus 1 */
        public boolean validPosition(int position) {
            return position >= 0 && position <= (arraySize - 1);
        }

        /* To be considered empty a position needs to be null in the array */
        public boolean emptyPosition(int position) {
            return students[position] == null;
        }

        public boolean isNotFull() {
            return index < arraySize;
        }

        public void addPosition(int position, Student student) {
            assureAvailableSpace();
                if (validPosition(position)) {
                    if (emptyPosition(position)) {
                        students[position] = student;
                    } else {
                        if (position == arraySize - 1) {
                            throw new ArrayIndexOutOfBoundsException("Unable to add new student. sequentialVectorStorage.old.Array is full.");
                        } else {
                            for (int i = index - 1; i >= position; i--) {
                                this.students[i + 1] = this.students[i];
                            }
                            this.students[position] = student;
                            index++;
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException("Unable to add new student. Invalid position.");
                }
        }

        public Student grab(int position) {
            if (validPosition(position)) {
                if (!emptyPosition(position)) {
                    return students[position];
                } else {
                    return null;
                }
            } else {
                throw new ArrayIndexOutOfBoundsException("Invalid position.");
            }
        }

        public void remove(int position) {
            if (validPosition(position)) {
                if (!emptyPosition(position)) {
                    for (int i = position; i < index; i++) {
                        this.students[i] = this.students[i + 1];
                    }
                    index--;
                    students[index] = null;
                    System.out.println("Position [" + position + "] removed");
                } else {
                    throw new ArrayIndexOutOfBoundsException("Position is already empty.");
                }
            }
        }

        public boolean exist(Student student) {
            for (int i = 0; i < index; i++) {
                if (student.equals(students[i])) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return index;
        }

        @Override
        public String toString() {
            return "sequentialVectorStorage.old.Array{" + "students=" + Arrays.toString(students) + '}';
        }

}
