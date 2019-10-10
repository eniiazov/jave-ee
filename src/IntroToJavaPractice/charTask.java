package IntroToJavaPractice;

import java.util.Scanner;

public class charTask {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char char1 = in.nextLine().charAt(0);
        char char2 = in.nextLine().charAt(0);
        System.out.println(char1 > char2);
    }
}
