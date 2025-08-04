import java.util.*;

public class MinMax {
    public int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        MinMax obj = new MinMax();
        int[] result = obj.findMinMax(ar);

        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}
