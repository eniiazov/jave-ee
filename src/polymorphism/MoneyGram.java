package polymorphism;

public class MoneyGram implements MobileVerifieable {

    @Override
    public boolean verify() {
        System.out.println("Money Gram is cancelling the transaction");
        return false;
    }
}
