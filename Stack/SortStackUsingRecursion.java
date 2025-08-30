import java.util.Stack;
class SortStackUsingRecursion {

    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sort(stack);

        if (stack.isEmpty() || top > stack.peek()) {
            stack.push(top);
        } 
        else {
            int temp = stack.pop();
            stack.push(top);
            sort(stack);  
            stack.push(temp);
        }
    }
     public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        sort(stack);  

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
