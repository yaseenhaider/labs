class BankAccount{

    private double balance;

public BankAccount(double initialBalance){
    if(initialBalance>0)
    {
        this.balance=initialBalance;

    }
    else {
       this.balance=0;
    }
}

public void deposit(double amount){
    if(amount>0)
    {
        balance+=amount;
    }
    else{
        System.out.println("enter positive amount");
    }
}
public void withdraw(double amount){
    if(amount>0 && amount<=balance)
    {
        balance-=amount;
    }
    else {
        System.out.println("enter valid amount");
    }
}

public double getBalance(){
    return balance;
}
}
public class Code4{
    public static void main(String[] args) {

        BankAccount a1=new BankAccount(900000);
        a1.deposit(9009);
        System.out.println("enter balance:"+a1.getBalance());

        a1.withdraw(8976);
        System.out.println("enter balance:"+a1.getBalance());



    }
}
