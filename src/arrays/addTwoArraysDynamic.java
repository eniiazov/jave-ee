package arrays;

import java.util.Arrays;

public class addTwoArraysDynamic {
    public static void main(String[] args) {
        int [] arrayOne = {3,2,6,43,7,20, 5, 4};
        int [] arrayTwo = {2,7,-10,10,-5,2,6, 4};

        int small, big;
        boolean same = false;

        if(arrayOne.length > arrayTwo.length) {
            big = arrayOne.length;
            small = arrayTwo.length;
        } else if(arrayTwo.length > arrayOne.length) {
            big = arrayTwo.length;
            small = arrayOne.length;
        } else {
            big = arrayOne.length;
            small = arrayTwo.length;
            same = true;
        }

        int [] sum = new int[big];

        for(int i=0; i < small; i++) {

            sum[i] = arrayOne[i] + arrayTwo[i];

        }

        if(big == arrayOne.length && !same) {
            sum[big-1] = arrayOne[big-1];
        } else if(big == arrayTwo.length && !same) {
            sum[big-1] = arrayTwo[big -1];
        }

        System.out.println(Arrays.toString(sum));

    }
}
