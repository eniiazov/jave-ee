package switchStatements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char grade = input.nextLine().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Great");
                break;
            case 'C':
            case 'c':
                System.out.println("Okay");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do better");
                break;
            case 'F':
            case 'f':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("Not valid letter grade");
        }

    }
}
