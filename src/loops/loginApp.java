package loops;

import java.util.Scanner;

public class loginApp {
    public static void main(String[] args) {
        String password= "secret478";
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        for(; ; attempts++) {

            if(attempts == 3) {
                System.out.println("Your account is locked");
                break;
            }


            System.out.println("Enter the password");
            String userPass = input.nextLine();

            if(password.equals(userPass)) {
                System.out.println("Welcome to your profile");
                break;
            }

        }



    }
}
