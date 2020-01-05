package exceptions;

import stringBuilder.Ex;

public class Dog {
    int age;

   public void setAge(int age) throws Exception{
        if(age < 0 || age > 30) {
            throw new Exception(age + " is an invalid age");
        }
        this.age = age;
    }



    static void bark() throws Exception{
        System.out.println("Dog is barking");
        throw new Exception();
    }

}
