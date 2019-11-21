package classes;

public class DebitCard {

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public DebitCard(long cardNumber, String holderName, double balance) {

        this.holderName = holderName;
        this.balance = balance;

        if(String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number");
        }

    }

    public DebitCard(long cardNumber, String holderName, double balance, int pin, String cardType) {
        this(cardNumber,holderName,balance);

        if(String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }

        if(cardType.equalsIgnoreCase("mastercard") || cardType.equalsIgnoreCase("visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }

    }


    public void info() {
        System.out.println("Holder name " + holderName);
        System.out.println("Card Number " + cardNumber);
        System.out.println("Balance " + balance);

        if(cardType != null) {
            System.out.println("Card type is " + cardType);
        }

    }



}
