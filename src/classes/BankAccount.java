package classes;

public class BankAccount {

    String holderName;
    double balance;
    int accountNumber;
    String type;

    public void deposit(double amount){
        System.out.println(amount + " is deposited to your account");
        this.balance += amount;
    }

    public void transfer(double amount){
        if(this.balance >= amount){
            System.out.println(amount + "$ is transferred from your account");
            balance -= amount;
        }
        else{
            System.out.println("You don't have enough funds. Transfer failed!");
        }
    }

    public void info(){
        System.out.println("\nName: " + this.holderName);
        System.out.println("Balance: " + this.balance + "$");
        System.out.println("Type: " + this.type);
        System.out.println("Account number: " + this.accountNumber);
    }
}