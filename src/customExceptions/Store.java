package customExceptions;

public class Store {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        try{
            laptop.setOs("macdf");
            laptop.turnOn();
        } catch (InvalidOSException | LaptopNotTurningOnException e) {
            e.printStackTrace();
        }



    }
}
