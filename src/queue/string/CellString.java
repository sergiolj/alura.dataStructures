package queue.string;

public class CellString {
    private String value;
    private CellString next;

    public CellString(String value) {
        this.value = value;
        this.next = null;
    }
    public String getValue() {
        return value;
    }

    public CellString getNext() {
        return next;
    }
    public void setNext(CellString next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StringCell [value=" + value + ", next=" + next + "]";
    }
}
