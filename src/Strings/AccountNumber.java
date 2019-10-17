package Strings;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number");
        String num = input.nextLine();
        String firstNumber = num.substring(0,1);

        boolean invalid = true;
        if(!firstNumber.equals("5") || !firstNumber.equals("2")) {
            invalid = false;
        }


        if (invalid) {
            System.out.println("Invalid account number");
        } else{

            if(firstNumber.equals("5")) {
                if(num.length() == 10) {
                    System.out.println("Valid 5 account");
                } else {
                    System.out.println("Invalid 5 account");
                }
            }

            if(firstNumber.equals("2")) {
                if(num.length() == 7) {
                    System.out.println("Valid 2 account");
                } else {
                    System.out.println("Invalid 2 account");
                }
            }






        }

    }
}
