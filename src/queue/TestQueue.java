package queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("First in");
        queue.enqueue("Second in");
        queue.enqueue("Third in");
        queue.enqueue("Fourth in");
        System.out.println(queue);
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue("Fifth in");
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());

        System.out.println(queue);
    }
}
