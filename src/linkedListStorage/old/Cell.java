package linkedListStorage.old;

public class Cell {
    private Object element;
    private Cell next;

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Cell[Next Element=" + element + ", next=" + next + "]";
    }
}
