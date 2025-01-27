package doublyLinkedList;

/**
 * The list grows from left (beginning - head) to right (end - tail), as new items ate added.
 * This means that, in a standard iteration, the first item in the list is the most recently added (newest),
 * while the last item is typically the oldest.
 * A standard iteration starts from index zero.
 *
 */
public class DoublyLinkedList <T> {
    private Node <T> rightBoundary;
    private Node <T> leftBoundary;
    private int nodeCount = 0;

    /**
     * Adds the first node to an empty list.
     * - Initializes a new node with prev and next pointers set to null.
     * - Sets both leftBoundary and rightBoundary to the new node.
     * - Increment the number of nodes in the list.
     *
     * @param element The element to be added as the first element of the list.
     * Revised commentary.
     */
    private void addAtBeginning(T element) {
            Node <T> newNode = new Node(element);
            this.leftBoundary = newNode;
            this.rightBoundary = newNode;
        nodeCount++;
    }

    /**
     * Adds a node to the end of the list (tail - rightBoundary).
     * - Checks if the list is empty. If true, it uses the addAtBeginning(T element) method to add the element.
     * - Otherwise:
     *      - Initializes a new node with its prev and next pointers set to null.
     *      - Sets the new node's prev pointer to point to the current rightBoundary.
     *      - Update the current rightBoundary's next pointer to point to the new node.
     *      - Sets the rightBoundary to the new node.
     *
     * - Increments the number of nodes in the list.
     * @param element The element to be added at the end (tail or rightBoundary) of the list.
     * Revised commentary.
     */
    public void addAtEnding(T element) {
        if(nodeCount == 0) {
            addAtBeginning(element);
        }else {
            Node<T> newNode = new Node<>(element);
            newNode.setPrev(rightBoundary);
            rightBoundary.setNext(newNode);
            rightBoundary = newNode;
            nodeCount++;
        }
    }

    /**
     * Adds a node to the beginning of the list (head - leftBoundary).
     * - Checks if the list is empty. If true, it uses the addAtBeginning(T element) method to add the element.
     * - Otherwise:
     *      - Initializes a new node with its next and prev pointers set to null.
     *      - Sets the new node's next pointer to point to the current leftBoundary.
     *      - Update the current leftBoundary's prev pointer to point to the new node.
     *      - Sets the leftBoundary to the new node.
     *
     * - Increments the number of nodes in the list.
     * @param element The element to be added at the beginning (head or leftBoundary) of the list.
     * Revised commentary.
     */
    public void add(T element) {
        if(nodeCount == 0) {
            addAtBeginning(element);
        }else{
            Node<T> newNode = new Node<>(element);
            newNode.setNext(leftBoundary);
            leftBoundary.setPrev(newNode);
            leftBoundary = newNode;
            nodeCount++;
        }
    }

    /**
     * Adds a node at a specific position index of the list using left to right standard iteration.
     * - Checks if the given position is within the valid range of the list.
     *      - If the index is 0, it uses the add(T element) method to add the element to the beginning of the list.
     *      - If the index is equal to the number of elements in the list, it uses the
     *      addAtEnding(T element) method to add the element to the end of the list.
     *      - Otherwise:
     *      - Initializes a new node with the given element.
     *      - Initializes both current and previous nodes based on the given index.
     *      - Updates the previous node's next pointer to point to the new node.
     *      - Sets the new node's prev pointer to point to the previous node.
     *      - Sets the new node's next pointer to point to the current node.
     *      - Updates the current node's prev pointer to point to the new node.
     * - Otherwise, if the index isn't valid display a message "Index out of bounds".
     *
     * - Increments the number of nodes in the list.
     * @param element The element to be added at a specific position of the list.
     * @param index The position to insert the element (from 0 to the size of the list).
     * Revised commentary.
     */
    public void add(T element, int index) {
        if(validIndex(index)) {
            if (index == 0) {
                add(element);
            } else if (index == nodeCount-1) {
                addAtEnding(element);
            } else {
                Node<T> newNode = new Node<>(element);
                Node<T> current = getNode(index);
                Node<T> previous = getNode(index - 1);

                previous.setNext(newNode);
                newNode.setPrev(previous);
                newNode.setNext(current);
                current.setPrev(newNode);
                nodeCount++;
            }
        }else{
            System.out.println("Index out of bounds");
        }
    }

    /**
     * Remove a node from the beginning of the list (head).
     * - Update the leftBoundary node's to its next node.
     * - Sets the rightBoundary node's prev pointer to null.
     *
     * Decrements the number of nodes in the list.
     */
    public void removeAtBeginning() {
        leftBoundary = leftBoundary.getNext();
        leftBoundary.setPrev(null);
        nodeCount--;
    }

    /**
     * Remove a node from the ending of the list (tail).
     * - Update the rightBoundary node's to its prev node.
     * - Sets the rightBoundary node's next pointer to null.
     *
     * Decrements the number of nodes in the list.
     */
    public void removeAtEnding() {
        rightBoundary = rightBoundary.getPrev();
        rightBoundary.setNext(null);
        nodeCount--;
    }

    /**
     * Remove a node from a specified position.
     *
     * @param index The position of the element to be removed (from 0 to the size of the list).
     */
    public void remove(int index) {
        if(validIndex(index)) {
            if (index == 0){
                removeAtBeginning();
            }else if(index == nodeCount -1){
                removeAtEnding();
            }else {
                Node<T> next = getNode(index + 1);
                Node<T> previous = getNode(index - 1);
                Node<T> current = getNode(index);

                previous.setNext(next);
                next.setPrev(previous);

                current.setNext(null);
                current.setPrev(null);
                nodeCount--;
            }
        }else {
            System.out.println("Index out of bounds");
        }
    }

    /**
     * Checks if a specified element appears at least once in the list.
     * This method ignores if are other elements with the same value stored in the list.
     *
     * @param element The element to be compared to the elements from the list.
     * @return True if the element is found; false otherwise.
     *
     */
    public boolean contains(T element) {
        Node<T> current = leftBoundary;
        while(current != null) {
            if(current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Retrieves the number of elements in the list.
     * @return The number of elements stored in the list.
     * Revised commentary.
     */
    public int getSize(){
        return nodeCount;
    }

    /**
     * Validates whether a given index is within the valid range of the list.
     * The valid range is from 0 to the size of the list.
     *
     * @param index The position to validate within the list.
     * @return True if the given index is within the valid range of the list; false otherwise.
     * Revised commentary.
     */
    private boolean validIndex(int index){
        return index >= 0 && index < nodeCount;
    }

    /**
     * Retrieves the node from a given index.
     *
     * @param index The position to retrieves the node from the list.
     * @return The node from a specific position.
     */
    public Node<T> getNode(int index) {
        if (validIndex(index)) {
            if ((nodeCount - index) >= index) {
                Node<T> current = leftBoundary;
                System.out.println("Order of iteration --->");
                if (index == 0){
                    return current;
                } else {
                    for (int i = 0; i < index; i++) {
                        current = current.getNext();
                    }
                    return current;
                }
            } else {
                Node<T> current = rightBoundary;
                System.out.println("<--- Order of iteration");
                if (index == nodeCount - 1) {
                    return current;
                } else {
                    for (int i = nodeCount; i > index; i--) {
                        current = current.getPrev();
                    }
                    return current;
                }
            }
        }
        return null;
    }

    public String nodeToString(int index) {
        if(validIndex(index)) {
            Node<T> node = getNode(index);
            return "{Element index: [" +  index + "], Value: " + node.getElement() + "}";
        }else{
            return "{Element index is invalid}";
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("DoublyLinkedList { ");
        Node<T> current = leftBoundary;
        while (current != null) {
            str.append(current.getElement().toString());
            current = current.getNext();
            if (current != null) {
                str.append(", ");
            }
        }
        str.append(" }");
        return str.toString();
    }

    public String toStringInvers() {
        StringBuilder str = new StringBuilder("Inverted DoublyLinkedList { ");
        Node<T> current = rightBoundary;
        while (current != null) {
            str.append(current.getElement().toString());
            current = current.getPrev();
            if (current != null) {
                str.append(", ");
            }
        }
        str.append(" }");
        return str.toString();
    }
}
