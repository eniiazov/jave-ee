package recapwednesdays;

import java.util.Scanner;

public class Methods_Login {
    public static void main(String[] args) {
        login();
    }

    public static void login(){
        //0- Create test data
        String expectedUsername = "johnJava";
        String expectedPassword = "123456";

        //1- Print out the intro text
        System.out.println("You have clicked to the login button!");
        System.out.println("Please enter username: ");

        //2- Request username from the user
        Scanner scan = new Scanner(System.in);
        String actualUsername = scan.nextLine();
        //3- Request password from the user
        System.out.println("Please enter password: ");
        String actualPassword = scan.nextLine();
        //4- Check if the expected username and actual username are matching
        //5- Print out final message
        if(expectedUsername.equalsIgnoreCase(actualUsername) && expectedPassword.equals(actualPassword)){
            System.out.println("You have logged in!");
        }else{
            System.out.println("Either your username or password is not matching!");
        }

    }
}
