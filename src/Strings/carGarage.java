package Strings;

public class carGarage {
    public static void main(String[] args) {
        String cars = "Toyota, BMW, Juguar,maserati";
        cars = cars.toLowerCase();

        if(cars.isEmpty()) {
            System.out.println("Garage is empty");
        }

        if(cars.contains("toyota") || cars.contains("nissan")) {
            System.out.println("There is a Japanese car in your garage");
        } else {
            System.out.println("There is no Japanese car in your garage");
        }

        if(cars.contains("bmw")) {
            System.out.println("There is a German car in your garage");
        } else {
            System.out.println("There is no German car in your garage");
        }

        if(cars.contains("maserati")) {
            System.out.println("There is a Italian car in your garage");
        } else {
            System.out.println("There is no Italian car in your garage");
        }

        if(cars.contains("jaguar")) {
            System.out.println("There is a British car in your garage");
        } else {
            System.out.println("There is no British car in your garage");
        }




    }
}
