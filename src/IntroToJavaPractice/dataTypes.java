package IntroToJavaPractice;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        char gender = input.nextLine().charAt(0);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your gpa");
        double gpa = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("GPA: " + gpa);

    }
}
