import java.util.*;
public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibbonacci Series "+a+ "");
        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    
}
