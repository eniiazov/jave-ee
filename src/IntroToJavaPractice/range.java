package IntroToJavaPractice;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int one = in.nextInt();

        boolean check = one > 0 && one <= 100;
        System.out.println(check);

    }
}
