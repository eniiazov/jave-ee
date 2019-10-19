package Strings;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine().toLowerCase();

//        if(name.charAt(0) == 'a' || name.charAt(0)== 'z') {
//            System.out.println("Cool name");
//        } else {
//            System.out.println("not Cool");
//        }

//        if(name.substring(0,1).equalsIgnoreCase("a") || name.substring(0,1).toLowerCase().equals("z")) {
//            System.out.println("cool");
//        } else {
//            System.out.println("not cool");
//        }


        if(name.startsWith("a") || name.startsWith("A") || name.startsWith("z") || name.startsWith("Z")) {
            System.out.println("Cool");
        } else {
            System.out.println("Not cool");
        }

    }
}
