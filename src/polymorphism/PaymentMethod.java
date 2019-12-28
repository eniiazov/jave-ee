package polymorphism;

public class PaymentMethod implements MobileVerifieable {

    public void charge(double amount){
        System.out.println("Amount charged: " + amount);
    }

    public void refund(double amount){
        System.out.println("Amount refunded: " + amount);
    }

    @Override
    public boolean verify() {
        System.out.println("Please approve from Payment Method");
        return true;
    }
}
