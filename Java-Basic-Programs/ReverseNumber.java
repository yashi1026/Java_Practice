import java.util.*;
public class ReverseNumber {
    static int Reversed(int num){
        int rev=0;
        while(num!=0){
          int d=num%10;
          rev=rev*10+d;
          num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        if(n<9){
        System.out.println("Numer below 9 is skip for revere");
        }
        else{
        System.out.print("Number before reverse : "+n+"\n");
        int result=Reversed(n);
        System.out.print("Number after reverse : "+result);
        }
    }
}
