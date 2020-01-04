package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        int age =0;
        try{

            System.out.println("Enter your age:");
            age = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid age entered");

        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);



    }


}
