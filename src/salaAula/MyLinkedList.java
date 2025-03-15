package salaAula;

public class MyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;
    private static int counter = 0;

    private void addAtBeginning(T element){
        Node<T> newNode = new Node<>(element, head);
        this.head = newNode;
        this.tail = newNode;
        counter++;
    }

    public void add(T element){
        if (counter == 0){
            addAtBeginning(element);
        }else{
            Node<T> newNode  = new Node<>(element, null);
            this.tail.setNext(newNode);
            this.tail=newNode;
            counter++;
        }
    }

    public void remove(){

    }

    public int getCounter(){
        return counter;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder("MyLinkedList {");
        Node<T> current = this.head;
        while (current != null){
            stb.append(current.getElement());
            if(current.getNext() != null){
                stb.append(", ");
            }
            current = current.getNext();
        }
        stb.append("}");
        return stb.toString();
    }
}
