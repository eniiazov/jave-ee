package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class garage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cars");
        int size = input.nextInt();
        input.nextLine();

        String [] myCars = new String[size];

        for(int i= 0; i < myCars.length; i++) {

            System.out.println("Enter car " + (i+1));
            String car = input.nextLine();

            myCars[i] = car;

        }

        System.out.println(Arrays.toString(myCars));

    }
}
