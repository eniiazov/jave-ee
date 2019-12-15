package inheritancePart2;

import inheritance.Dog;
import inheritance.Huskey;

public class Laptop {

    String model;
    int memorySize;
    protected String color;
    public static int numOfLaptops;


    public Laptop(String model){
        this.model = model;
    }

    public Laptop(){

    }

    public Huskey getMyDog(){
        System.out.println("Returning some dog");
        Dog dog = new Dog();
        return null;
    }

    protected void turnOn(){
        System.out.println("Laptop is turning on");
    }

    public void turnOn(String name){
        int age = 34;
    }
}
