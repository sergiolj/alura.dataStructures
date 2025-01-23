package linkedListStorage;

public class LinkedListG <T> {
    private Node<T> top; // top represents the first node add to the sequence, the oldest one.
    private Node<T> bottom; // bottom represents the last node add to the sequence, the newest and his pointer is always null.
    private int count = 0;

    public void addAtBeginning(T element) {
        Node<T> newNode = new Node<>(element, top);
        this.top = newNode;
        if(this.count == 0){
            this.bottom = newNode;
        }
        count++;
    }

    public void add(T element) {
        if (this.count == 0) {
            addAtBeginning(element);
        } else {
            Node<T> newNode = new Node<>(element, null);
            this.bottom.setNext(newNode);
            this.bottom = newNode;
            count++;
        }
    }

    public void addAtEnd(T element) {
        Node<T> newNode = new Node<>(element, bottom);
        this.bottom = newNode;
        count++;
    }

    public void add(T element, int index) {
        Node<T> newNode = new Node<>(element, null);
        Node<T> previous = getNodeAt(index -1);
        Node<T> next = getNodeAt(index);
        newNode.setNext(next);
        previous.setNext(newNode);
        count++;
    }

    public boolean contains(T element) {
        Node<T> current = this.bottom;
        for (int i = 0; i < count; i++) {
            if (current.getElement().equals(element)) {
                return true;
            } else {
                current = current.getNext();
            }
        }
        return false;
    }

    public boolean validNode(int index){
        return index >= 0 && index <= this.count;
    }

    public Node<T> getNodeAt(int index) {
        if(this.validNode(index)){
            Node<T> currentNode = new Node<>(null, bottom);
            if(index == 0){
                return currentNode;
            } else {
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.getNext();
                }
                return currentNode;
            }
        }else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getCount(){
        return this.count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("LinkedListG [");
        Node<T> current = this.bottom; // Cria um nó e aponta para o primeiro elemento criado.
        while(current != null){
            str.append(current.getElement());
            if(current.getNext() != null){
                str.append(", ");
            }
            current = current.getNext();
        }
        str.append("]");
        return str.toString();
    }

  }
