import java.util.*;
public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 9) {
            System.out.println("Number is not greater than 9. Skipping palindrome check.");
        } else {
            if (isPalindrome(num)) {
                System.out.println(num + " is a Palindrome number.");
            } else {
                System.out.println(num + " is NOT a Palindrome number.");
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;
        while (num > 0) {
            int d = num % 10;            
            rev = rev * 10 +d; 
            num = num / 10;                   
        }
          return n == rev;
    }
}

