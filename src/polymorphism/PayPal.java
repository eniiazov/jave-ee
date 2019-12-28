package polymorphism;

public class PayPal extends PaymentMethod {

    public void payOnline(){
        System.out.println("paying online with PayPal");
    }

    @Override
    public void charge(double amount) {
        System.out.println("\nAmount charged in Paypal: " + amount);
        System.out.println("Fee applied: $ 3");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded in Paypal: " + amount);
    }
}
