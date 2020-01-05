package exceptions;

import stringBuilder.Ex;

public class ThrowsExp {
    public static void main(String[] args)throws InterruptedException {

       // Dog.bark();
        Dog dog = new Dog();
        try {
            dog.setAge(40);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dog.age);

    }




}
