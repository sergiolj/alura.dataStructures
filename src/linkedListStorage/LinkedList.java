package linkedListStorage;

public class LinkedList {
    private Cell first = null;
    private Cell last = null;
    private int index = 0;


    public void addAtBeginning(Object element) {
        Cell newCell = new Cell(element, first);
        this.first = newCell;

        if(this.index == 0){
            this.last = this.first;
        }
        index++;

    }

    public void add(Object element) {}

    public void addAtEnd(Object element) {
        Cell newCell = new Cell(element, null);
        this.last.setNext(newCell);
        this.last = newCell;
        index++;
    }

    public void addPosition(int position, Object element) {}
    public Object retrieve(int position) { return null;}
    public void remove(int position) {}
    public int size() { return 0; }
    public boolean contains(Object element) { return false; }

    @Override
    public String toString() {
        if(this.index == 0) {
            return "[]";
        }
        Cell current = first;
        StringBuilder string = new StringBuilder("[");
        for(int i=0; i< index; i++) {
            string.append(current.getElement());
            string.append(", ");
            current = current.getNext();
        }
        string.append("]");
        return string.toString();


    }
}
