package stack;

public class Cell <T> {
    private T element;
    private Cell<T> next;

    public Cell(T element, Cell<T> next) {
        this.element = element;
        this.next = next;
    }
    public T getElement() {
        return element;
    }
    public void setNext(Cell<T> next) {
        this.next = next;
    }
    public Cell<T> getNext() {
        return next;
    }
    @Override
    public String toString() {
        return element.toString();
    }
}
