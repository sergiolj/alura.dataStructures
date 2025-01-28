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
        System.out.println(list.getSize());
        list.add("Second");
        System.out.println(list);
        System.out.println(list.getSize());
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println(list);
//
//        list.addAtEnding("Reverse First");
//        list.addAtEnding("Reverse Second");
//        System.out.println(list.getSize());
//        System.out.println("List");
//        System.out.println(list);
//
//        System.out.println(list.nodeToString(0));
//        System.out.println(list.nodeToString(8));
//        System.out.println(list.nodeToString(9));
//        list.removeAtBeginning();
//        System.out.println(list);
//        list.removeAtEnding();
//        System.out.println(list);
//        list.add("First at a specific position", 0);
//        list.add("Second at a specific position", 1);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.remove(6);
//        System.out.println(list);
//        //list.add(null);
//        System.out.println(list.contains("Second"));
//        System.out.println(list.contains("First"));
//        System.out.println(list.contains(null));
//        list.remove(5);
//        System.out.println(list);


    }



}
