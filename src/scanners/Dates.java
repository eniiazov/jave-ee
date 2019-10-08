package scanners;

import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month: ");
        int month = scanner.nextInt();
        System.out.println("Day: ");
        int day = scanner.nextInt();
        System.out.println("Year:");
        int year = scanner.nextInt();

        String result = "" + month + "/" + day + "/" + year;
        System.out.println(result);
        year += 5;
        day -= 1;

        String result2 = "" + month + "/" + day + "/" + year;

        System.out.println(result2);

    }
}
