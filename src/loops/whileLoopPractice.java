package loops;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter your address");
        String address = in.nextLine();

        int count = 0;

        while (address.contains("il")) {
            count++;

            System.out.println("enter your address");
            address = in.nextLine();
        }

        System.out.println(count);


    }
}
