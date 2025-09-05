import java.util.*;

public class StackUsingQueue {
    Queue<Integer> queue = new ArrayDeque<>();

    void push(int x) {
        queue.add(x);
        int size = queue.size();
        
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }

    int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.remove();
    }

    int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.peek();
    }

    boolean isEmpty() {
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top: " + stack.top());  // 15
        System.out.println("Pop: " + stack.pop());  // 15
        System.out.println("Top: " + stack.top());  // 10
    }
}
