package arrays;

import java.util.Arrays;

public class maxAndMin {
    public static void main(String[] args) {
        int [] arr = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(arr);
        System.out.println("Biggest number " + arr[arr.length-1]);
        System.out.println("Smallest number " + arr[0]);

    }
}
