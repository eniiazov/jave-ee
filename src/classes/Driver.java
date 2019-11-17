package classes;

public class Driver {

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.make = "Lexus";
//        car1.year = 2019;
//        car1.mileage = 5000;
//        car1.sportEdition = true;
//
//        System.out.println(car1.mileage);
//        car1.drive("Downtown");
//        System.out.println(car1.mileage);
//        car1.drive(213);
//        System.out.println(car1.mileage);
        BankAccount myBank = new BankAccount();
        myBank.holderName = "Obama";
        myBank.accountNumber = 42352;
        myBank.type = "Business";
        myBank.balance = 3200;

        myBank.info();
        myBank.deposit(5000);
        myBank.info();
        myBank.transfer(7000);
        myBank.info();
        myBank.transfer(1300);
        myBank.info();

    }
}
