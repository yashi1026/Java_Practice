import java.util.Stack;
public class NextGreater {

    public static void main(String args[ ]) {
        Stack<Integer> stack = new Stack<>();
          int[] arr = {4, 5, 2, 25};

        for (int i = 0; i < arr.length; i++) {
 
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                int smaller = stack.pop();
                System.out.println(smaller + " --> " + arr[i]);
            }
            stack.push(arr[i]);
        }

        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> -1");
        }
    }
}


