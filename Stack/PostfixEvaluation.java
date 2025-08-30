import java.util.Stack;
class PostfixEvaluation {

    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
               stack.push(Character.getNumericValue(ch));

            } 
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-"; 
        System.out.println("Result: " + evaluate(exp));
    }
}


