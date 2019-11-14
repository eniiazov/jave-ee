package multiDemensionalArray;

import java.util.Arrays;
import java.util.Random;

public class randomArray {

    public static void main(String[] args) {
        int [][] number = createRandom2DArray(4,5);
        System.out.println(Arrays.deepToString(number));
    }

    /*
    Create a method that will generate a random 2D int array. Take two parameters. The first one for how many 1D arrays you want, and second how many elements each 1D array should have
     */

    public static int [][] createRandom2DArray(int numOfArrays, int numOfElements) {

        int [][] arr = new int[numOfArrays][numOfElements];
        Random random = new Random();

        for(int i=0; i < arr.length; i++) {

            for(int j=0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(10);

            }

        }

        return arr;


    }


}
