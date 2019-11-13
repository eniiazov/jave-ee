package multiDemensionalArray;

public class TwoDArrayMethods {
    public static void main(String[] args) {

        int [][] arr = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        System.out.println(biggestNumberFrom2DArray(arr));
        System.out.println(indexOfBiggestSumArray(arr));

    }

    public static int indexOfBiggestSumArray(int [][] twoDarray) {

        int index = 0;
        int biggest = 0;

        for(int i=0; i < twoDarray.length; i++) {
            int sum = 0;

            for(int j=0; j <twoDarray[i].length; j++) {
                sum += twoDarray[i][j];
            }

            if(sum > biggest) {
                biggest = sum;
                index = i;
            }

        }

        return index;

    }


    public static int biggestNumberFrom2DArray(int [][] twoDarr) {

        int biggest = twoDarr[0][0];

        for(int i=0; i < twoDarr.length; i++) {

            for(int j = 0; j < twoDarr[i].length; j++) {

                if(twoDarr[i][j] > biggest) {
                    biggest = twoDarr[i][j];
                }

            }

        }

       return biggest;
    }


}
