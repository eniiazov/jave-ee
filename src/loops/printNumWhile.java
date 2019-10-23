package loops;

import java.util.Scanner;

public class printNumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number above 0");
        int num = input.nextInt();
        int start = 0;
        while(start <= num) {
            System.out.println(start++);
        }

    }
}
