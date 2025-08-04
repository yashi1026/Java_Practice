abstract class Bank{
    abstract int getInterestRate();
}
class SBI extends Bank{
    int getInterestRate(){
        return 5;
    }
}
class HDFC extends Bank{
    int getInterestRate(){
        return 7;
    }
}
public class BankExample {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI Rate of Interest :"+b1.getInterestRate()+"%");
        System.out.println("SBI Rate of Interest :"+b2.getInterestRate()+"%");
    }
}
