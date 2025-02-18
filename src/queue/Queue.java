package queue;

import util.OrdinalGenerator;

import static util.OrdinalGenerator.getOrdinal;

public class Queue <T> {
    private int size = 0;
    private Cell<T> first;
    private Cell<T> last;
    private T t;

    public Queue() {}

    public int getSize() {
        return size;
    }

    public void enqueue(T value) {
        Cell<T> newCell = new Cell<>(value);
        if (last != null) {
            last.setNext(newCell);
        }
        this.last = newCell;
        if (first == null) {
            this.first = newCell;
        }
        size++;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public String getLast(){
        if(last.getNext() == null){
            return "Last " + last.getValue() + " --> " + "null";
        }
        return "Last " + this.last.getValue() + " --> " + last.getNext().getValue().toString();
    }
    public String getFirst(){
        return "First " + first.getValue() + " --> " + first.getNext().getValue().toString();
    }

    public T dequeue() {
        if (!isEmpty()) {
            T deleted = peek();
            first = first.getNext();
            size--;
            return deleted;
        } else {
            System.out.println("Queue is empty.");
        }
        return null;
    }

    private T peek() {
        return first.getValue();
    }

    @Override
    public String toString() {
        Cell<T> current = first;
        StringBuilder sb = new StringBuilder("Queue{");
        while (current != null) {
            sb.append(current.getValue());
            sb.append(", ");
            current = current.getNext();
        }
        sb.append("}");
        return sb.toString();
    }
}
