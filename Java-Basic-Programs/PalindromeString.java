import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str= sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        reversed+=str.charAt(i);
        if(str.equals(reversed))
        System.out.println(str+" is a Palindrome ");
        else
        System.out.println(str+" is not a Palindrome");
    }
}
