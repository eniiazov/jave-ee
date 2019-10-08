package scanners;

import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int retirementAge = 65;
        int result = retirementAge - age;

        System.out.println("Because you are " + age +
                ", you will retire in " + result + " years");

    }
}
