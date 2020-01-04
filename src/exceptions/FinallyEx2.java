package exceptions;

import java.util.Scanner;

public class FinallyEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(3/5);
            System.out.println(new int [] {2,3}[6]);
            System.out.println(45);
        }catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        } finally {
            System.out.println("Java is almost done");
            input.close();
        }


        try{

        } finally {

        }

    }
}
