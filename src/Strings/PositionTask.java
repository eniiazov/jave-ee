package Strings;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class PositionTask {
    public static void main(String[] args) {

        String str = "Cybertek is located in Des Plaines";

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        int index = str.indexOf(word);
        System.out.println(index);

    }
}
