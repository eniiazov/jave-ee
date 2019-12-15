package methodOverriding;

public class SavingsAccount extends BankAccount {

    public double interestIncome;

    @Override
    public void transfer(double amount){
        this.balance -= amount;
        this.balance -= (amount * 0.2);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Interest Income: " + interestIncome);
    }

    public void calculateAnnualInterestIncome(){
        interestIncome += this.balance * 0.03;
    }
}
