public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 20, 8, 15};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i ;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest: " + second);
        }
    }
}
