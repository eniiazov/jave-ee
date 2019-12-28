package polymorphism;

public class BankAccount extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("\nAmount charging in Bank Account: " + amount);
        System.out.println("Fee applied: $ 30");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunding in Bank Account: " + amount);
    }

}
