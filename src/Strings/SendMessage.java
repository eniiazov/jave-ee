package Strings;

import java.util.Random;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your message");
        String message = input.nextLine();

        if(message.length() >= 15) {

            System.out.println("Message was sent");
            int num = random.nextInt(10); // 2

            if(num % 2 == 1) {
                System.out.println("Message delivered");
            } else {
                System.out.println("Message was not delivered");
            }

//            if(random.nextBoolean()) {
//                System.out.println("Message delivered");
//            } else {
//                System.out.println("Message was not delivered");
//            }


        } else {
            System.out.println("Message too short. Message not sent");
        }



    }
}
