package linkedList;

public class TestLinkedListG {
    public static void main(String[] args) {
        Node<String>  node1 = new Node<>("A", null);
        Node<String>  node2 = new Node<>("B", null);
        node1.setNext(node2);
        Node<String> node3 = new Node<>("C", null);
        node2.setNext(node3);
        System.out.println(node1.toString());

        LinkedListG<String> list = new LinkedListG<>();

        System.out.println(list.getSize());
        list.add("Adrian");
        System.out.println(list.getSize());
        System.out.println(list);
        list.add("David");
        list.add("Mary");
        System.out.println(list);
        list.add("John");
        System.out.println(list);
        list.add("John 2");
        list.addAtBeginning("Adam");
        System.out.println(list);
        System.out.println(list.getNodeAt(2));
        System.out.println("Position zero is a valid parameter? "+list.validNode(0));

        list.add("Bewolf",2);
        System.out.println(list);

        System.out.println(list.getNodeAt(2).getElement());
        System.out.println(list.contains("Bewolfer"));
        System.out.println(list.contains("Mary"));
        System.out.println(list);
        System.out.println(list.getSize());
        list.remove(1);
        System.out.println(list);
        list.remove(6);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
