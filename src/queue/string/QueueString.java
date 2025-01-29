package queue.string;

import static util.OrdinalGenerator.getOrdinal;

public class QueueString {
    private int size = 0;
    private CellString first;
    private CellString last;

    public QueueString() {}

    public int getSize() {
        return size;
    }

    public void enqueue(String value) {
        CellString newCell = new CellString(value);
        if (last != null) {
            last.setNext(newCell);
        }
        this.last = newCell;
        if (first == null) {
            this.first = newCell;
        }
        size++;
    }

    public String enqueue() {
        String value = getOrdinal(this.size+1);
        CellString newCell = new CellString(value);
        if (last != null) {
            last.setNext(newCell);
        }
        this.last = newCell;
        if (first == null) {
            this.first = newCell;
        }
        size++;
        return value;
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

    public String dequeue() {
        if (!isEmpty()) {
            String deleted = peek();
            first = first.getNext();
            size--;
            return deleted;
        } else {
            System.out.println("Queue is empty.");
        }
        return null;
    }

    private String peek() {
        return first.getValue();
    }

    @Override
    public String toString() {
        CellString current = first;
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

