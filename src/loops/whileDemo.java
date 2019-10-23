package loops;

import java.util.Scanner;

public class whileDemo {
    public static void main(String[] args) {
//        int num = 0;
//        while (num <= 15) {
//            System.out.println(num++);
//        }

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.nextLine();
        while (name.startsWith("j")) {
            System.out.println("Enter your name");
            name = in.nextLine();
        }


    }
}
