package variablesBatch14;

public class primitiveTasks {

    /*
    Task:
You have variablesBatch14: first name and variable last name
--> Another variable: email
 ---> firstName + lastName + @cybertek.com
Print in this format:

First name: the first name
Last name: the last name
Email: the email

Task2:
You have number of chairs stored as a short datatype with the value of 5
More chairs were ordered so we need something to store more chairs
--> Change the chair datatype to long
You realize you now have too much storage
--> Change the chair datatype to int
     */
    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Bond";
        String end = "@cybertek.com";
        int favNum = 10;
        String email = firstName +lastName + favNum + end;
        System.out.println(email);


        short chairs = 5;
        System.out.println(chairs);
        long moreChairs = chairs;
        System.out.println(moreChairs);
        int lessChairs;
        lessChairs = (int)moreChairs;
        System.out.println(lessChairs);
        double doubleNum = (double)lessChairs;
        System.out.println((double)lessChairs);
    }
}
