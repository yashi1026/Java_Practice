import java.util.*;

public class ReverseQueue {

    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;

        int item = q.poll();
        reverse(q);
        q.add(item);
    }

    public static void main(String[] args) {
     
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
