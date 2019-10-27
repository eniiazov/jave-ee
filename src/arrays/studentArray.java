package arrays;

import java.util.Scanner;

public class studentArray {
    public static void main(String[] args) {
        String [] students = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy" };

        for(int i = 0; i < students.length; i++) {
            int last = students[i].length()-1;
            System.out.println(students[i].charAt(last));
        }

        System.out.println();

        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().endsWith("s")) {
                System.out.println(students[i]);
            }
        }

        System.out.println();

        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().contains("s")) {
                System.out.println(students[i]);
                // students[i] = students[i].toLowercase();
            }
        }

        System.out.println();

        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().contains(user)) {
                System.out.println(students[i]);
            }
        }


    }
}
