package loops;

import java.util.Scanner;

public class readName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        for(int i=0; i < 15; i++) {
            System.out.println(name +  " " + i);
        }

        System.out.println();

        for(int i= 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + " for index " + i);
        }


    }
}
