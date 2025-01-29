package queue.string;

public class TestQueueString {
    public static void main(String[] args) {
        QueueString q = new QueueString();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q);

        QueueString q2 = new QueueString();
        System.out.println(q2.enqueue());
        System.out.println(q2.enqueue());
        System.out.println(q2.enqueue());
        System.out.println(q2.enqueue());
        System.out.println(q2.enqueue());
        System.out.println(q2.enqueue());

        System.out.println(q2);

        System.out.println(q2.dequeue());
        System.out.println(q2);
        System.out.println(q2.getSize());
    }
}
