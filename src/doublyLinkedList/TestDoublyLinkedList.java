package doublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        Node<String> d1 = new Node<>("First", null, null);
        Node<String> d2 = new Node<>("Second", null, null);
        Node<String> e1 = new Node<>("Third", null, null);
        d1.setNext(d2);
        d2.setPrev(d1);
        e1.setNext(d1);
        d1.setPrev(e1);

        System.out.println(d1.toString());
        System.out.println(e1.toString());
        System.out.println(d2.toString());
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("First");
        System.out.println(list);
        System.out.println(list.getSize());
        list.add("Second");
        System.out.println(list);
        System.out.println(list.getSize());
        list.add("Third");
        list.addAtEnding("Fourth");
        list.addAtEnding("Fifth");
        list.add("Sixth");
        System.out.println(list.getSize());
        System.out.println(list);
        System.out.println(list.nodeToString(1));
        System.out.println(list.nodeToString(6));
        list.getNode(4);
        System.out.println(list.toStringInvers());
        System.out.println(list.toString());
        list.add("Middle",2);
        System.out.println(list);
        list.add("Second to last",7);
        System.out.println(list);
        list.add("First one",1);
        System.out.println(list);
        list.add("Ninth",9);
        System.out.println(list);
        list.removeAtBeginning();
        System.out.println(list);
        list.removeAtEnding();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(7);
        System.out.println(list);

        DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
        list2.add("First");
        list2.add("Second");
        list2.add("Third");
        list2.add("Fourth");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.removeAtBeginning();
        System.out.println(list2);
    }



}
