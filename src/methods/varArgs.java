package methods;

import java.util.Arrays;

public class varArgs {

    public static void main(String[] args) {
        int []a = {3};
        maxNumber(a,4,2,40,12,4,2,23,7);
    }

    public static void maxNumber(int [] a, int ... arr) {
        Arrays.sort(arr);
        System.out.println("The biggest number is " + arr[arr.length-1]);
    }
}
