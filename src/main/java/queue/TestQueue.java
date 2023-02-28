package queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("------enqueue-------");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("------print-------");
        q.print_queue();
        System.out.println("-----dequeue-----");
        System.out.println(q.dequeue().value);
        System.out.println("------print-------");
        q.print_queue();

    }
}
