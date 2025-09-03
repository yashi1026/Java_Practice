public class TwoInOneStack {
    int[] arr;
    int top1, top2;

    public TwoInOneStack(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
    
    public void push1(int x) {
        if (top1 + 1 < top2) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    public void push2(int x) {
        if (top1 + 1 < top2) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < arr.length) {
            return arr[top2++];
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }
    public static void main(String[] args) {
        TwoInOneStack stack = new TwoInOneStack(6);

        stack.push1(10);
        stack.push1(20);
        stack.push1(30);

        stack.push2(90);
        stack.push2(80);
        stack.push2(70); 

        System.out.println("Pop Stack 1: " + stack.pop1()); // 30
        System.out.println("Pop Stack 1: " + stack.pop1()); // 20
        System.out.println("Pop Stack 2: " + stack.pop2()); // 70
        System.out.println("Pop Stack 2: " + stack.pop2()); // 80
        System.out.println("Pop Stack 1: " + stack.pop1()); // 10
        System.out.println("Pop Stack 1: " + stack.pop1()); // Underflow

        System.out.println("Pop Stack 2: " + stack.pop2()); // 90
        System.out.println("Pop Stack 2: " + stack.pop2()); // Underflow

    }
}
