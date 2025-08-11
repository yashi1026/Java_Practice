import java.util.*;
class RepetitiveAdditionOfDigit{
    static int singleDigit(long n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        long num = sc. nextLong();
        System.out.println("Repititive sum is : "+singleDigit(num));
    }
}