package ifElseStatements;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        /*
        —> BMI Formula: BMI = mass / (height * height)
—> Values:
Less than 18.5 — Underweight
From 18.5 to 25 — Normal weight
From 25 to 30 — Overweight
More than or equal to 30 — Obese
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass in kilogram");
        double mass = input.nextDouble();

        System.out.println("Enter your height in meters");
        double height = input.nextDouble();

        double bmi = mass / (height * height);

        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if(bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }






    }
}
