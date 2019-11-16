package casses;

public class Car {

    String make;
    int mileage;
    int year;
    boolean sportEdition;

    public void drive(){
        System.out.println(year + " " + make + " is driving.");
        mileage += 10;
    }

    public void drive(String destination){
        System.out.println(this.year + " " + this.make + " is driving to " + destination);
        this.mileage += 10;
    }

    public void drive(int miles){
        System.out.println(this.year + " " + this.make + " is driving " + miles + " miles");
        this.mileage += miles;
    }

}
