public class GCD{
    public void GreatestFactor() {
        int a=12,b=18;
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        System.out.println("GCD is:"+gcd);
    }
    public static void main(String[] args) {
         GCD  obj=new GCD();
         obj.GreatestFactor();
    }  
}