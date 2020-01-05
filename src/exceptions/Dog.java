package exceptions;

import stringBuilder.Ex;

public class Dog {
    int age;

   public void setAge(int age) throws DogInvalidAgeException{
        if(age < 0 || age > 30) {
            throw new DogInvalidAgeException();
        }
        this.age = age;
    }



    public void bark() {

       if(this.age > 20) {
           throw new DogNotBarkableException();
       }

        System.out.println("Dog is barking");

    }

}
