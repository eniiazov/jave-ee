package inheritance;

import encapsulation.App;
import java.util.Random;

public class Dog extends Object{

    int age;
    String breed;
    String name;
    double weight;
    String color;

    public void bark(){
        System.out.println("Dog is barking");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

}
