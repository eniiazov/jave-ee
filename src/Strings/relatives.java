package Strings;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class relatives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name1 = in.nextLine().trim();
        String name2 = in.nextLine().trim();

        String last1 = name1.substring(name1.indexOf(" "));
        String last2 = name2.substring(name2.indexOf(" "));

        if(last1.trim().equals(last2.trim())) {
            System.out.println("relatives");
        } else {
            System.out.println("not relatives");
        }
    }
}
