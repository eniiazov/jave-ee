package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOne, numTwo;

        try{
            System.out.println("Enter number one");
            numOne = input.nextInt();
            System.out.println("Enter number two");
            numTwo = input.nextInt();

            System.out.println(numOne + "/" + numTwo + " = " + (numOne/numTwo));


        } catch (InputMismatchException e) {
            System.out.println("One of the numbers was invalid");
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by 0");
        }


    }
}
