package recapwednesdays;

public class ArrayMultiDimTable {
    public static void main(String[] args) {

        int [][] numbers = {
                {44,62,12,51,33}, //row 0
                {33,66,54,12,25}, //row 1
                {65,78,56,42,22}, //row 2
                {14,12,15,16,14}
        };

        for(int row=0; row<numbers.length; row++){

            for (int col=0; col<numbers[row].length; col++){
                System.out.print(numbers[row][col] +"\t");
            }
            System.out.println();

        }
    }
}
