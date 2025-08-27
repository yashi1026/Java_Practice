import java.util.*;
public class ImplementUsingDynamicSizeArray {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();

        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println(s.get(s.size() - 1) + " popped from stack");
        s.remove(s.size() - 1);

        System.out.println("Top element is: " + s.get(s.size() - 1));

        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s.get(s.size() - 1) + " ");
            s.remove(s.size() - 1);
        }
    }
} 
