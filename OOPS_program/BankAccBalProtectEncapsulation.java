class BankAccount{
    double balance;
    public BankAccount(double initialBalance){
        if(initialBalance>0)
        this.balance=initialBalance;
    }
    public void deposit(double amount){
        if(amount>0)
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>0 && balance>=amount)
        balance-=amount;
        else
        System.out.println("Insufficient balance or invalid amount.");
    }
    public double getBalance(){
        return balance;
}
}
public class BankAccBalProtectEncapsulation {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        System.out.println("Current Balance : "+acc.getBalance());
    }
}
