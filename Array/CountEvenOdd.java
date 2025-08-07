import java.util.*;

public class CountEvenOdd {
    public int[] EvenOdd(int arr[]) {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        return new int[]{even, odd}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        CountEvenOdd obj = new CountEvenOdd();
        int[] result = obj.EvenOdd(ar); 

        System.out.println("No of even's are: " + result[0]);
        System.out.println("No of odd's are: " + result[1]);
    }
}
