package linkedListStorage;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list);
        list.addAtBeginning("Jhon");

        System.out.println(list);
        list.addAtBeginning("Peter");

        System.out.println(list);
        list.addAtBeginning("Mary");
        System.out.println(list);

        list.addAtEnd("Zood");
        System.out.println(list);

        list.addAtBeginning("Adam");
        System.out.println(list);

    }
}
