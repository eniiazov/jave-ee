package mentorings.tuesday.staticClass;

public class Lexus {
    /*
    Instance variables: model, year, color, mileage, new or not (boolean), price
Static variables: totalNumOfLexus
     */

    String model;
    int year;
    String color;
    double mileage;
    boolean isNew;
    double price;
    static int totalNumOfLexus;

    public Lexus(String model, int year) {
        this.year = year;
        this.model = model;
        totalNumOfLexus++;
    }

    public static double milesToKm(double miles) {
        return miles * 1.6;
    }

    public static void evaluateCar (Lexus car) {
        int age = 2019 - car.year;

        if(car.mileage < 50000 && age < 3) {
            System.out.println("Best Choice");
        } else if((car.mileage >= 50000 && car.mileage < 100000) && age >= 3 && age < 7 ) {
            System.out.println("Fair choice");
        } else if(car.mileage >= 100000 && car.mileage < 200000) {
            System.out.println("You decide");
        } else if(car.mileage >= 200000) {
            System.out.println("Stay away");
        } else {
            System.out.println("Not able to evaluate");
        }


    }







}
