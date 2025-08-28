import java.util.*;
public class RemoveDuplicate {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr.length;

        Arrays.sort(arr);  
        int j = 0;  
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; 
            }
        }
        return j + 1;  
    }
    public static void main(String[] args) {
        int[] input = {4, 2, 7, 4, 2, 9, 1};

        System.out.print("Array before removing duplicates: ");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        int n = removeDuplicates(input);
        System.out.println("");
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
