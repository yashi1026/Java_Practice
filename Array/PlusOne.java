import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of digits in array ");
        int n= sc.nextInt();
        int arr[] = new int [n];
        System.out.println(" Enter digits ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                String result = "";
                for (int j : arr) {
                    result = result + j;
                }
                System.out.println("Result as string: " + result);
                return;
            }
            arr[i] = 0;
        }
        int[] resultArray = new int[n + 1];
        resultArray[0] = 1;
        String result = "";
        for (int num : resultArray) {
            result = result + num;
        }
        System.out.println("Result as string: " + result);
    }
}

       
       
       
       
       
       
       
       
       
      































