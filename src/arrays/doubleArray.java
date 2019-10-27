package arrays;

import java.util.Arrays;

public class doubleArray {
    public static void main(String[] args) {
        /*
        2) Declare and initialize double array for prices.
Store following prices:
45.99, 23.5, 11.50, 33.33, 99.99.
Print the values then change the last element to 112.89.
Print all values again
         */

        double [] arr = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1] = 112.89;

        System.out.println(Arrays.toString(arr));


    }
}
