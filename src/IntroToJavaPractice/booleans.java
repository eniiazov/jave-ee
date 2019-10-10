package IntroToJavaPractice;

import java.util.Scanner;

public class booleans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        boolean b = one > two;
        System.out.println(b);
        System.out.println("\nTask 4: ");

        boolean check = in.nextBoolean();
        System.out.println(!check);


    }
}
