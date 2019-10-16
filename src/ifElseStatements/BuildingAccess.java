package ifElseStatements;

import java.util.Scanner;

public class BuildingAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        if(age < 0 || age > 100) {
            System.out.println("Invalid age");
        } else if(age >= 30) {
            System.out.println("Welcome to the building");
        } else {
            System.out.println("Try again when you are 30");
        }



    }
}
