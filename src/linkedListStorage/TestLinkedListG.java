package linkedListStorage;

public class TestLinkedListG {
    public static void main(String[] args) {
        Node<String>  node1 = new Node<>("A", null);
        Node<String>  node2 = new Node<>("B", null);
        node1.setNext(node2);
        Node<String> node3 = new Node<>("C", null);
        node2.setNext(node3);
        System.out.println(node1.toString());

        LinkedListG<String> list = new LinkedListG<>();
        System.out.println(list.getCount());
        list.add("Adrian");
        System.out.println(list.getCount());
        System.out.println(list);
        list.add("David");
        list.add("Mary");
        System.out.println(list);

        list.add("Marcus");
        System.out.println(list.getCount());
        System.out.println(list);
        list.addAtEnd("FarLeft");
        System.out.println(list);
        list.add("Alice");
        System.out.println(list);
        System.out.println(list.getCount());
        System.out.println(list.getNodeAt(6));
        list.add("Pussycat",5);
        System.out.println(list);
        list.contains("Pussycat");
        System.out.println(list.getNodeAt(1));
    }
}
