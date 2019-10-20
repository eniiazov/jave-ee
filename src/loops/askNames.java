package loops;

import java.util.Scanner;

public class askNames {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;

        for (int i= 0; i < 5; i++) {
            System.out.println("Enter name " + (i+1));
             name = input.nextLine();
            System.out.println(name);
        }

    }
}
