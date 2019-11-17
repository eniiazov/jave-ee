package constructors;

public class PhoneTest {

    public static void main(String[] args) {
        Phone phone = new Phone("IPhone X", "Gold");
        phone.info();
        phone.memory = 45;
        phone.info();
        Phone samsung = new Phone("Samsung Galaxy", "Black", -45, true);
        samsung.info();
        System.out.println("--------");

        boolean result = samsung.text(9233214563L, "hello");
        System.out.println(result);

        phone.call(123425490L);
    }
}
