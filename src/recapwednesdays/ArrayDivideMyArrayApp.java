package recapwednesdays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivideMyArrayApp {
    public static void main(String[] args) {

        //1- Print out the welcome&intro message
        System.out.println("Welcome to DivideMyArray app!!!");
        System.out.println("Enter a number that will be the size of your array");
        //2- Accept an int input from user and assign it as the size of the Array
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        //3- Print out "enter numbers for your array" message
        System.out.println("Enter numbers for your array:");
        int [] numbers = new int[size];
        //4- Accept int input values from user and assign them as the elements of the array
        for(int i=0; i<size; i++){
            numbers[i]= scan.nextInt();
        }

        //5- Print out "string value" of the array
        System.out.println("String value of your array is: " + Arrays.toString(numbers));

        //6- Create a logic to print out first and second half of the arrays in different lines
        //Arrays.copyOfRange(originalArray, from, to);

        int [] part1 = Arrays.copyOfRange(numbers, 0, numbers.length/2);
        int [] part2 = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);

        System.out.println("The first half of your array is: " + Arrays.toString(part1));
        System.out.println("The second half of your array is: " + Arrays.toString(part2));
    }
}
