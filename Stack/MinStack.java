import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(4);
        ms.push(2);
        ms.push(5);
        ms.push(1);
        System.out.println("Min: " + ms.getMin()); // 1
        ms.pop();
        System.out.println("Min: " + ms.getMin()); // 2
        System.out.println("Top: " + ms.top());    // 5
    }
}
