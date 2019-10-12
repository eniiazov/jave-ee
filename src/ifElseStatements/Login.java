package ifElseStatements;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "cybertek1";
        String password = "Cybertek123";

        System.out.println("Please enter your username:");
        String enteredUsername = input.nextLine();

        if(enteredUsername.equals(username)){

            System.out.println("Please enter your password:");
            String enteredPass = input.nextLine();
            if(enteredPass.equals(password)){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Wrong password");
            }

        }
        else{
            System.out.println("Invalid username. Try again");
        }

    }
}
