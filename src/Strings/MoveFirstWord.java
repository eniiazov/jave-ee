package Strings;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sen = input.nextLine();

        int space = sen.indexOf(" ");
//        int space2 = sen.indexOf(" ", space+1);
//        System.out.println(space2);
        String firstWord = sen.substring(0,space);
        String reamin = sen.substring(space + 1);
        System.out.println(reamin + " " + firstWord);

    }
}
