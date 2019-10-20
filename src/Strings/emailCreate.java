package Strings;

import java.util.Scanner;

public class emailCreate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine().trim();
        String second = input.nextLine().trim();
        String email = "";

        if(first.length() >= 6 && second.length() >= 6) {
            email = first.substring(0,4).toLowerCase();
            email += second.substring(second.length()- 3);
            email += "@cybertek.com";
            System.out.println(email);
        } else {
            System.out.println("Invalid lengths ");
        }


    }
}
