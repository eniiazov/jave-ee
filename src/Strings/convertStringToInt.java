package Strings;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class convertStringToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine(); //“I am x years old”
        int am = str.indexOf("am") + 3;
        int years = str.indexOf(" years");
        String age = str.substring(am,years);
        int ageNum = Integer.valueOf(age);
        ageNum += 5;
        System.out.println("In 5 years you will be " + ageNum);
    }
}
