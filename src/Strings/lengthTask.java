package Strings;

import java.util.Scanner;

public class lengthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine();

        if(message.isEmpty()) {
            System.out.println("Message is empty");
        } else if(message.length() >= 10) {
            System.out.println("Message is good");
        } else {
            System.out.println("Message is too short");
        }



    }
}
