package ifElseStatements;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers, hit enter after each number");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 == num2 && num1 == num3) {

            System.out.println("All the numbers are equal");
        } else if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the biggest");
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }




    }
}
