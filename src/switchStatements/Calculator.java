package switchStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");
        double num = input.nextDouble();
        System.out.println("Enter number two");
        double num2 = input.nextDouble();

        input.nextLine();
        System.out.println("Enter the operator");
        String op = input.nextLine();
        double result = 0;
        boolean valid = true;

        switch (op) {
            case "+":
                result = num + num2;
                break;

            case "-":
                result = num - num2;
                break;

            case "*":
                result = num * num2;
                break;

            case "/":
                result = num / num2;
                break;
            case "%":
                result = num % num2;
                break;
            default:
                System.out.println("Invalid Operator");
                valid = false;
        }

        if(valid) {
            System.out.println(num + op +  num2 + "= " + result);
        }


    }

}
