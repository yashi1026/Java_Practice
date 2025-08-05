import java.util.*;
public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n=sc.nextInt();
        int[] arr = new int[n]; 
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(" ");
        } 
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
    System.out.println(" Array is Sorted: " + isSorted);
    }
}
