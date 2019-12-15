package methodOverriding;

public class BankAccount {

    // Public instance variables: balance, accountNumber, name  
    public double balance;
    public int accountNumber;
    public String name;

    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    @Override
    public String toString(){
        String result = "Name: " + this.name + "\nAcc Num: "
                + this.accountNumber + "\nBalance: " + this.balance;
        return result;
    }

    public void transfer(double amount){
        System.out.println("Money is transferred: " + amount);
        this.balance -= amount;
        this.balance -= (amount * 0.1);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit success");
    }




}
