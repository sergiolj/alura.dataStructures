package salaAula;

public class TestNode {
    public static void main(String[] args) {

        var c1 = new Contact("Marcio", "mar@gmail");
        var c2 = new Contact("André", "and@hotmail");
        var c3 = new Contact("Carla", "car@yahoo");

        Node<Contact> n1 = new Node<>(c1, null);
        Node<Contact> n2 = new Node<>(c2, null);

        System.out.println(n1);
        System.out.println(n2);
        n1.setNext(n1);

    }
}
