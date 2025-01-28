package queue;

public class Queue <T> {
    private int size = 0;
    private Cell<T> first;
    private Cell<T> last;

    public Queue() {}

    public int getSize() {
        return size;
    }
    public void add(T value) {

    }
    public T remove() {
        return null;
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
