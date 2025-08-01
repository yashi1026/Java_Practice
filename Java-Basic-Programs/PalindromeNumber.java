import java.util.*;
public class PalindromeNumber {
    static int reverse(int num) {
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
      return rev;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int res=reverse(n);
        if(n<9)
        System.out.println("Number is less than 9 skip palindrome check");
        else if(n==res)
        System.out.println("Palindrome no : "+n);
        else
        System.out.println("Not a Palindrome no : "+n);
    }
}



