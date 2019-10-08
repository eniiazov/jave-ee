package scanners;

import java.util.Scanner;

public class MinsToHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the minutes:");
        int mins = scanner.nextInt();
        int hours = mins/60;
        int remaindingMinutes = mins % 60;

        System.out.println(mins + " minutes is " + hours +
                " hours and " + remaindingMinutes + " minutes");

    }
}
