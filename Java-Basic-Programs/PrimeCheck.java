import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a Prime number");
            } else {
                System.out.println(arr[i] + " is NOT a Prime number");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if(num%2==0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
