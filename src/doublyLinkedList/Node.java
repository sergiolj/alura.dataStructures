package doublyLinkedList;

public class Node <T> {
    private T element;
    private Node<T> next;
    private Node<T> prev;

    public Node(T element) {
        if(element == null) {
            throw new IllegalArgumentException("Node element cannot be null");
        }
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public Node (T element, Node<T> next, Node<T> prev) {
        if(element == null) {
            throw new IllegalArgumentException("Node element cannot be null");
        }
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public T getElement(){
        return element;
    }
    public void setElement(T element){
        this.element = element;
    }
    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public Node<T> getPrev(){
        return prev;
    }
    public void setPrev(Node<T> prev){
        this.prev = prev;
    }

    @Override
    public String toString(){
        String previous, next;
        if (this.getPrev() == null) {
            previous = "Left boundary of the list";
        } else {
            previous = this.getPrev().getElement().toString();
        }
        if (this.getNext() == null) {
                next = "Right boundary of the list";
            }else{
                next = this.getNext().getElement().toString();
        }
        return "[previous = " + previous + "] - { Node Element= " + this.getElement() + " } - [next = "+ next +"]";
    }
}
