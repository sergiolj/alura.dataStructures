package sequentialVectorStorage.old;
import sequentialVectorStorage.Student;

public class ArrayTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");
        Student student3 = new Student("Peter");
        Student student4 = new Student("Gabriel");
        Student student5 = new Student("Mary");

        Array array = new Array();
        array.add(student1);
        array.add(student2);
        array.add(student3);
        //array.add(student4);
        System.out.println(array);
        System.out.println(array.grab(3));
        array.remove(1);
        System.out.println(array);

        //array.add(student5);

        array.addPosition(0, student4);
        System.out.println(array);
        System.out.println(array.grab(0));

        //array.addPosition(1, student5);

        System.out.println(array);
        System.out.println("sequentialVectorStorage.old.Array occupancy " + array.size());
        System.out.println(array.exist(student1));


        array.add(student2);
        System.out.println(array);
        System.out.println("sequentialVectorStorage.old.Array sit taken " + array.exist(student3));
        System.out.println(array.emptyPosition(1));
        System.out.println(array.emptyPosition(2));

        //array.remove(2);
        System.out.println(array);

        array.addPosition(1,student4);
        System.out.println(array);
        array.add(student4);
        System.out.println(array);
    }

}
