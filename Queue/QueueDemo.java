import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front: " + q.peek());
        q.remove();
        System.out.println("After removal, Front: " + q.peek());
    }
}
