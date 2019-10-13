package ifElseStatements;

import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int time;

        System.out.println("Enter the time you are checking");
        time = input.nextInt();

        if(time < 0 || time >= 24) {
            System.out.println("Invalid time");
        } else if(time >= 8 && time <= 23) {
            System.out.println("Campus is open");
        } else {
            System.out.println("Campus is closed");
        }



    }
}
