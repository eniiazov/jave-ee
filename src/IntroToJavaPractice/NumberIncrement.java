package IntroToJavaPractice;

import java.util.Scanner;

public class NumberIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int one= input.nextInt();
        int two = input.nextInt();

        int count = 0;

        one += two; // 5 += 10 -> 15
        count++;

        System.out.println("Your number is: " +  one + " after being incremented by " + two + " " + count + " time");
        one += two;
        count++;

        System.out.println("Your number is: " +  one + " after being incremented by " + two + " " + count + " time");
        one += two;
        count++;

        System.out.println("Your number is: " +  one + " after being incremented by " + two + " " + count + " time");



   }
}
