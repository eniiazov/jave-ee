package classes;

public class DebitTest {
    public static void main(String[] args) {

        DebitCard db1 = new DebitCard(2333333333333333L, "james",30);
        db1.info();

        System.out.println();

        DebitCard db2 = new DebitCard(5333333333333333L, "adam",300, 3632,"vi");
        db2.info();


    }



}
