package stack;

public class Stack <T> {
    private Cell<T> top;
    private Cell<T> bottom;
    private int size = 0;

    /**
     * Add a cell in the stack.
     * @param element
     */
    public void push(T element) {
        Cell<T> newCell = new Cell<>(element, top);
            this.top = newCell;
            if(this.size == 0) {
                this.bottom = newCell;
            }
        size++;
    }

    /**
     * Display the element from the top Cell.
     * @return
     */
    public String getTop() {
        String next= this.top.getNext().toString();
        return "Top " + this.top.getElement().toString() + " -> "+ next;
    }

    /**
     * Display the element from the bottom Cell.
     * @return
     */
    public String getBottom() {
        String next="";
        if(this.bottom.getNext() != null) {
            next = this.bottom.getNext().toString();
        } else {
            next = "null";
        }
        return "Bottom " + this.bottom.getElement().toString() + " -> "+ next;
    }

    /**
     * Remove the last cell from the stack.
     * @return
     */
    public T pop() {
        if (!this.isEmpty()) {
            T deleted = peek();
            this.top = this.top.getNext();
            size--;
            return deleted;
        }
        return null;
    }

    /**
     * Retrieve the last cell from the stack.
     * @return
     */
    public T peek() {
        if (!isEmpty()) {
            return this.top.getElement();
        } else {
            return null;
        }
    }

    /**
     * Retrieve the size of the stack.
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     * @return
     */
    public boolean isEmpty() {
        if(this.size == 0) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Stack{");
        Cell<T> current = this.top;
        while (current != null) {
            str.append(current.getElement());
            str.append(", ");
            current = current.getNext();
        }
        str.append("}");
        return str.toString();
    }
}
