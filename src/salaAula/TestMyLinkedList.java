package salaAula;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Contact> agenda = new MyLinkedList<>();

        var c1 = new Contact("Marcio", "mar@gmail");
        var c2 = new Contact("André", "and@hotmail");
        var c3 = new Contact("Carla", "car@yahoo");

        System.out.println(c1);

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);

        System.out.println(agenda.getCounter());
        System.out.println(agenda);

    }
}
