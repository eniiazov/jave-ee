package ifElseStatements;

import java.util.Scanner;

public class NumberOfOddsEvens {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens = 0;
        int odds = 0;

        if(num1 % 2 == 0){
            evens++;
        }else{
            odds++;
        }

        if(num2 % 2 == 0){
            evens++;
        }else{
            odds++;
        }

        if(num3 % 2 == 0){
            evens++;
        }else{
            odds++;
        }

        if(num4 % 2 == 0){
            evens++;
        }else{
            odds++;
        }

        if(num5 % 2 == 0){
            evens++;
        }else{
            odds++;
        }

        System.out.println("Total even numbers: " + evens);
        System.out.println("Total odd numbers: " + odds);
    }
}
