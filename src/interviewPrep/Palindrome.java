package interviewPrep;

public class Palindrome {

    public static boolean isPalindrome(long number) {

        long workingNum = number;
        long reverse = 0;

        // num % 10 -> last digit of our number
        //
        // 1001

        while(workingNum != 0) {

           long last =  workingNum % 10;

           reverse =  reverse * 10 + last;

           workingNum /= 10;
        }

        return number == reverse;


    }

}
