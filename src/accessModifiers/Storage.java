package accessModifiers;

import java.util.Scanner;

public class Storage {

    public static void main(String[] args) {
//        Chair chair = new Chair();
//        chair.model = "Home Depot";
//        chair.setSize(15);
//
//        chair.info();
//        System.out.println(chair.getSize());


        Person person = new Person();
        person.setName("Zeynep");
        System.out.println(person.getName());
//        person.setAge(-59);
//        System.out.println(person.getAge());

        // Ask user to enter age for Zeynep until user enters
        // valid age.
        // User Scanner

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 0 && age < 120){
                person.setAge(age);
                break;
            }
        }while (true);

        System.out.println(person.getAge());
    }
}
