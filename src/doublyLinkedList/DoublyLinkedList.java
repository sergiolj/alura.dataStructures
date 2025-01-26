package doublyLinkedList;

/**
 * Verificar a ordem de inserção e busca de elementos pois está confuso o que é considerado primeiro e último
 * Seria mais fácil considerar apenas direita e esquerda, mas aparentemente é possível fazer ambos conceitos
 * convergirem.
 * @param <T>
 */
public class DoublyLinkedList <T> {
    private Node <T> rightBoundary;
    private Node <T> leftBoundary;
    private int nodeCount = 0;

    private void addAtBeginning(T element) {
            Node <T> newNode = new Node(element);
            this.leftBoundary = newNode;
            this.rightBoundary = newNode;
        nodeCount++;
    }

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

    public void add(T element, int index) {
        if(validIndex(index)) {
            if (index == 1) {
                add(element);
            } else if (index == nodeCount) {
                addAtEnding(element);
            } else {
                Node<T> newNode = new Node<>(element);
                Node<T> currentNode = getNode(index);
                Node<T> previousNode = getNode(index - 1);

                previousNode.setNext(newNode);
                newNode.setPrev(previousNode);
                newNode.setNext(currentNode);
                currentNode.setPrev(newNode);
                nodeCount++;
            }
        }
    }

    public void removeAtBeginning() {
        rightBoundary = rightBoundary.getPrev();
        rightBoundary.setNext(null);
        nodeCount--;
    }

    public void removeAtEnding() {
        leftBoundary = leftBoundary.getNext();
        leftBoundary.setPrev(null);
        nodeCount--;
    }

    public void remove(int index) {
        if(validIndex(index)) {
            if (index == 1){
                removeAtEnding();
            }else if(index == nodeCount){
                removeAtBeginning();
            }
        }

    }

    public boolean contains(T element) {
        return false;
    }

    public int getSize(){
        return nodeCount;
    }

    private boolean validIndex(int index){
        return index >= 1 && index <= nodeCount;
    }

    public Node<T> getNode(int index) {
        if (validIndex(index)) {
            if ((nodeCount - index) >= index) {
                Node<T> current = leftBoundary;
                System.out.println("--->");
                if (index == 1) {
                    return current;
                } else {
                    for (int i = 1; i < index; i++) {
                        current = current.getNext();
                    }
                    return current;
                }
            } else {
                Node<T> current = rightBoundary;
                System.out.println("<---");
                if (index == nodeCount) {
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
        Node<T> node = getNode(index);
        return "{Element number: [" +  index + "], Value: " + node.getElement() + "}";
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
