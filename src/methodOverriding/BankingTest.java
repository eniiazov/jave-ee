package methodOverriding;

public class BankingTest {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.balance = 300;
        ba.name = "Jennifer Lawrence";
        ba.accountNumber = 423442;
        System.out.println(ba);
    }
}
