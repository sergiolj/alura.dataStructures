package linkedList;

public class LinkedListG <T> {
    /**
     * These two pointers (head and tail), created by the list structure, manage to control the boundaries of the list
     * When a list is created, both pointers are initialized and set to null
     * The head's pointer point to the first node in the sequence. Head is not a node itself,
     * it's just a reference to a node!
     * The tail's represents the newest node add in the sequence, the "next" attribute pointer from this node,
     * in this case, is null, this defines the final of the list.
     * This Linked List grows normally from (first - older) head -> tail (end - newer) from "creation nodes" point of view.
     * To navigate through the list you must point out to the first element (head)
     */
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    /**
     * Add an element in the beginning of the Linked list.
     * - Creates a new node that points to the head.
     * - Update the head pointer to point to this new node.
     * - If this is the first and unique list element (count ==0):
     *      - The tail pointer also update to point to this new node.
     * - Increments the count of nodes in the list.
     *
     * @param element The element to be added as the first element from the list.
     */
    public void addAtBeginning(T element) {
        Node<T> newNode = new Node<>(element, head);
        this.head = newNode;
        if(this.count == 0){
            this.tail = newNode;
        }
        count++;
    }

    /**
     * Adds a new element to the sequence of the list (just after the last previous added).
     * - If the list is empty, the method redirects to addTheFirstNode(T element).
     * - Otherwise:
     *      - Creates a new node pointing null, indicating the end of the list.
     *      - The actual tail's pointer is updated to points to this new node.
     *      - Update the tail pointer to the new node.
     * - Increments the count of nodes in the list.
     *
     * @param element The element to be added at the end of the list.
     */
    public void add(T element) {
        if (this.count == 0) {
            addAtBeginning(element);
        } else {
            Node<T> newNode = new Node<>(element, null);
            this.tail.setNext(newNode);
            this.tail = newNode;
            count++;
        }
    }

    /**
     * Adds a new element to the Linked list in a position set by user.
     * - Creates a new node that points to null.
     * - Updates the node next attribute to node taken position.
     * - Updates the previous node to point to new node.
     * - Increments the count of nodes in the list.
     *
     * @param element The element to be added at a specific position.
     * @param position The index set the position in the Linked List to insert the new node.
     * Revised commentary
     */

    public void add(T element, int position) {
        Node<T> newNode = new Node<>(element, null);
        newNode.setNext(getNodeAt(position));
        getNodeAt(position -1).setNext(newNode);
        count++;
    }

    /**
     * Remove an element from the list at the position specified by the user.
     * - Validates that the given position is within the valid range of the list.
     * - Display an informative message about the operation performed.
     * - Checks if the given position corresponds to the first node in the list.
     *      - Updates the head to point to the head next node.
     *    -Checks if the given position corresponds to the last node in the list.
     *      - Updates the node before the given position next node to null.
     *      - Updates de tail to reference the node before the given position.
     * - Otherwise:
     *      - Updates the next pointer of the node before the given position to node after to skip over the removed node.
     *
     * @param position The position of the element to be removed from the list.
     * Revised commentary
     */
    public void remove(int position) {
        if(validNode(position)){
            System.out.println("The element at position " + position + " has been removed from the list!");
            if(getNodeAt(position).equals(this.head)){
                this.head = this.head.getNext();
            } else if(getNodeAt(position).equals(this.tail)) {
                getNodeAt(position - 1).setNext(null);
                this.tail = getNodeAt(position - 1);
            }else{
                getNodeAt(position -1).setNext(getNodeAt(position+1));
            }
        }
    }



    /**
     * Checks whether a specific element exists in the list and returns a boolean result.
     * - Initializes a node pointer set to the head of the list.
     * - Ensures the pointer is not null to avoid NullPointerException.
     * - Iterates through the list using the count as a limit.
     * - Retrieves the element from the current node and compares it with the given element.
     * - Returns true if a match was found.
     * - Otherwise, move the pointer to the next node.
     * - If no match is found after traversing the list, returns false.
     *
     * @param element The element to search for within the list.
     * @return true if the element is found, false otherwise.
     * Revised commentary
     */
    public boolean contains(T element) {
        Node<T> current = this.head;
        while (current != null) {
            for (int i = 0; i < count; i++) {
                if (current.getElement().equals(element)) {
                    return true;
                } else {
                    current = current.getNext();
                }
            }
        }
        return false;
    }

    /**
     * Validates whether a given position is within the valid range of the list.
     * - A position is considered valid if it's greater than zero and less than or equal to
     * the number of elements in the list (count).
     *
     * @param position Is the index of the element in the list.
     * @return true if the position is within the valid range, false otherwise.
     * Revised commentary.
     */
    public boolean validNode(int position){
        return position > 0 && position <= this.count;
    }

    /**
     * Retrieves the node at a specific position in the list.
     * - Check if the given position is a valid one.
     *      - Throw an IndexOutOfBoundsException if the position is invalid.
     * - If valid, initializes a pointer to the head of the list.
     * - If position node is equal to the first node, returns currentNode.
     * - Otherwise, iterates through the list from head updating the pointer to the next node
     *  until the given position is reached.
     * - Returns the node at the given position.
     *
     * @param position Is the index of the element in the list.
     * @return The node located at the specific position.
     * @throws IndexOutOfBoundsException if the position is out of the valid range.
     * Revised commentary.
     */
    public Node<T> getNodeAt(int position) {
        if(this.validNode(position)){
            Node<T> currentNode = this.head;
            if(position == 1){
                return currentNode;
            } else {
                for (int i = 1; i < position; i++) {
                    currentNode = currentNode.getNext();
                }
                return currentNode;
            }
        }else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    /**
     * Returns the total number of elements currently stored in the list.
     * - The size of the list is tracked by the global variable 'count'.
     *
     * @return The total number of elements in the list.
     * Revised commentary.
     */
    public int getSize(){
        return this.count;
    }

    /**
     * Overrides the toString() method to display all node elements in the list.
     * - Initializes a StringBuilder object with the class name as the starting value.
     * - Sets a node pointer to reference the head of the list.
     * - Validates that the current node isn't null, (ensuring the list is not empty).
     *      - Appends the SB object with the element from the current node.
     *      - Checks if the next node isn't null (last node of the list)
     *          - Appends a comma and a space.
     *          - Update the current node to the next in the list.
     *      - When the current node is the last one (next == null)
     *      - Append a closing bracket.
     *  - Return the content of the StringBuilder object as a String.
     *
     * @return A String containing all the elements of the list.
     * Revised commentary
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("LinkedListG [");
        Node<T> current = this.head;
        while(current != null){
            str.append(current.getElement());
            if(current.getNext() != null){
                str.append(", ");
            }
            current = current.getNext();
        }
        str.append("]");
        return str.toString();
    }
  }
