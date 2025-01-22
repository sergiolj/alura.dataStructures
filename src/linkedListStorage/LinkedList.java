package linkedListStorage;

public class LinkedList {
    private Cell head = null;
    private Cell tail = null;
    private int index = 0;


    public void addAtBeginning(Object element) {
        Cell newCell = new Cell(element, head);
        this.head = newCell;
        if(this.index == 0){
            this.tail = this.head;
        }
        index++;
    }

    /*
    Method to add an element into last position of the linked list.
     */
    public void add(Object element) {
        Cell newCell = new Cell(element, null);
        this.tail.setNext(newCell);
        this.tail = newCell;
        index++;
    }

    public void add(int position, Object element) {
        if(position == 0){
            addAtBeginning(element);
        } else if (position == this.index) {
            add(element);
        }else{
            Cell before = this.getCell(position -1);
            Cell newCell = new Cell(element, before.getNext());
            before.setNext(newCell);
            this.index++;
        }
    }

    public Cell getCell(int position) {
        if (positionOccupied(position)) {
            Cell cell = this.head;
            for(int i = 0; i < position; i++){
                cell = cell.getNext();
            }
            return cell;
        }else{
            throw new IllegalArgumentException("Position is out of bounds");
        }
    }

    public Object getElement(int position) {
        return getCell(position).getElement();
    }

    public void remove(int position) {
        if(this.index == 0){
            throw new IllegalArgumentException("List is empty");
        }
        /*If the position is equal the index it means that corresponds to the oldest element inserted to the list, the tail. */
        if(position == this.index ) {
            Cell before = getCell(position-1);
            this.tail = null;
            before = this.tail;
            this.index--;
        }
        /*If the position number is 0 the element is the last one inserted in the list, this corresponds to the newest element of the list, the head. */
        if(position == 0){
            this.head = this.head.getNext();
            this.index--;
        }

        if(this.index == 0){
            this.tail = null;
        }




//        Cell after = this.getCell(position+1);
//        Cell before = this.getCell(position-1);
//        Cell delete = null;
//        before.setNext(after);

    }

    public int size() {
        return index;
    }

    public boolean positionOccupied(int position) {
        return position >=0 && position < index;
    }

    public boolean contains(Object element) { return false; }

    @Override
    public String toString() {
        if(this.index == 0) {
            return "[]";
        }
        Cell current = head;
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
