import java.util.*;

public class InterleaveQueue {

    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            throw new IllegalArgumentException("Queue must have an even number of elements.");
        }

        int n = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Original queue: " + q);
        interleaveQueue(q);
        System.out.println("Interleaved queue: " + q);
    }
}
