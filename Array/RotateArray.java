import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        int k = 2;                    
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            rotated[i] = arr[i - k];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}

