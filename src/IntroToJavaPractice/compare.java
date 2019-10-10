package IntroToJavaPractice;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        boolean check = one != two;
        System.out.println(check);

    }
}
