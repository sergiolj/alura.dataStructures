package sequentialVectorStorage;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return other.getName().equals(this.name);
    }
}
