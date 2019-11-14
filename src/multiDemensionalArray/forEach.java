package multiDemensionalArray;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int [][] numbers = { {1,2,3,9} , {4,5} , {7,8,9} };

        for(int [] inner : numbers) {
            System.out.println(Arrays.toString(inner));
//            for(int element : inner) {
//                System.out.println(element);
//            }
            System.out.println();
        }

    }
}
