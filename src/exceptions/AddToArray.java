package exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};

        try{
            System.out.println("Enter the index you want to change");
            int index = input.nextInt();
            System.out.println("Enter the number you want to add");
            int number = input.nextInt();

            arr[index] = number;
        } catch (InputMismatchException e) {
            System.out.println("Invalid number entered");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entered an invalid index");
        } finally {
            System.out.println(Arrays.toString(arr));
        }



    }
}
