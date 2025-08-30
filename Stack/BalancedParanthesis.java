public class BalancedParanthesis {

    public static boolean isBalanced(String expr) {
        char[] temp = new char[expr.length()];
        int index = 0;

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                temp[index++] = ch; 
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (index == 0) return false; 
                char last = temp[--index]; 
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        
        return index == 0; 
    }

    public static void main(String[] args) {
        
        String[] expressions = {
            "({[]})",    
            "({[})",      
            "((()))",     
            "([)]",       
            "",           
            "(()",        
            "{[()]}",    
            "({[]})]",    
        };

        for (String expr : expressions) {
            System.out.println("Expression: " + expr + " --> " + isBalanced(expr));
        }
    }
}
