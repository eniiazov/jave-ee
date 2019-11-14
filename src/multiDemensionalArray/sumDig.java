package multiDemensionalArray;

import java.util.Arrays;

public class sumDig {
    public static void main(String[] args) {
        int [][] nums = randomArray.createRandom2DArray(4,4);
//        System.out.println(Arrays.deepToString(nums));
        printArray(nums);
        System.out.println(differenceOfSum(nums));
    }

    public static void printArray (int [][] a) {
        for(int [] arr : a) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int differenceOfSum(int [][] arr)  {

        int sumOne = 0;
        int sumTwo = 0;

        for(int i=0 , j = arr.length-1; i < arr.length; i++, j--) {

            sumOne += arr[i][i];
            sumTwo += arr[j][i]; //arr[arr.length-1-i][i]
        }


        return Math.abs(sumOne - sumTwo);

    }


}
