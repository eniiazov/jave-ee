package IntroToJavaPractice;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double one = input.nextDouble();
        double two = input.nextDouble();

        System.out.println("Add: " + (one + two));
        System.out.println("Sub: " + (one - two));
        System.out.println("Div: " + (one / two));
        System.out.println("Multi: " + (one * two));
        System.out.println("Remind: " + (one % two));


    }
}
