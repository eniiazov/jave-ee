package exceptions;

import stringBuilder.Ex;

import java.io.File;
import java.io.IOException;

public class ThrowsExp {
    public static void main(String[] args)throws InterruptedException, IOException {

       // Dog.bark();
        Dog dog = new Dog();
        dog= null;
        try {
            dog.setAge(80);
        } catch (DogInvalidAgeException e) {
            System.out.println("Invalid age");
            System.out.println(e.toString());
        }
        System.out.println(dog.age);

    }




}
