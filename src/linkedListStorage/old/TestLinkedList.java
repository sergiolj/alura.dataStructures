package linkedListStorage.old;

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

        list.add("Zood");
        System.out.println(list);

        list.addAtBeginning("Adam");
        System.out.println(list);
        list.add("Richard");
        System.out.println(list);

        Cell a1 = new Cell(1,null);

        Cell a2 = new Cell(2,null);
        a1.setNext(a2);

        Cell a3 = new Cell(3,null);
        a2.setNext(a3);

        System.out.println(a1);
        System.out.println(a1.getNext());
        System.out.println(a2.getNext());
        System.out.println(a3.getNext());
        System.out.println(list.getCell(2));
        System.out.println(list.getElement(2));
        System.out.println(list.size());

        System.out.println(list.getCell(5));

        list.add(6,"David");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.positionOccupied(0));
        System.out.println(list.positionOccupied(1));
        System.out.println(list.positionOccupied(2));
        System.out.println(list.positionOccupied(3));
        System.out.println(list.positionOccupied(4));
        System.out.println(list.positionOccupied(5));
        System.out.println(list.positionOccupied(6));
        System.out.println(list.positionOccupied(7));
        System.out.println(list.size());
        list.remove(6);
        System.out.println(list);


    }
}
