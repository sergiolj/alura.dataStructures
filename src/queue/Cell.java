package queue;

public class Cell <T>{
    private T value;
    private Cell<T> next;

    public Cell(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public Cell<T> getNext() {
        return next;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Cell [value=" + value + ", next=" + next + "]";
    }
}
