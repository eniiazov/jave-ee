package staticClass;

public class Dealer {
    public static void main(String[] args) {
        Lexus carOne = new Lexus("x",2016);
        carOne.mileage= 5340;

        Lexus.evaluateCar(carOne);
    }
}
