import java.util.*;

public class QueueUsingStack {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek());       // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 20

        queue.enqueue(40);
        System.out.println("Peek: " + queue.peek());       // Output: 30
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 30
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 40

        System.out.println("Dequeue: " + queue.dequeue()); // Output: Queue is empty, -1
    }
}
