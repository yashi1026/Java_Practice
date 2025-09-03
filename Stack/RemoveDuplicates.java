import java.util.Stack;
class RemoveDuplicates {
    
    public static Stack<Integer> removeConsecutiveDuplicates(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (result.isEmpty() || result.peek() != top) {
                result.push(top);
            }
        }

        Stack<Integer> finalStack = new Stack<>();
        while (!result.isEmpty()) {
            finalStack.push(result.pop());
        }
        return finalStack;
    }
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(1);
        s.push(2);
        s.push(2);
        s.push(3);

        Stack<Integer> result = removeConsecutiveDuplicates(s);
        System.out.println(result); // Output: [1, 2, 3]  
        
    }
}
