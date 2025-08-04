import java.util.*;

public class ArmstrongNumer {
    static int armstrong(int num){
        int result=0;
        while(num!=0){
            int digit=num%10;
            result+=digit*digit*digit;
            num=num/10;
        }
        return result;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int arm=armstrong(n);
        if(n==arm)
        System.out.println(n+" is an Armstrong number");
        else
        System.out.println(n+" is not an Armstrong number");
    }
}
