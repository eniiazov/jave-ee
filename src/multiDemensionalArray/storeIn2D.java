package multiDemensionalArray;

import java.util.Arrays;

public class storeIn2D {
    public static void main(String[] args) {
        String [][] groups = new String[3][];
        String [] arr1 = {"name1", "name2", "name3", "name4"};
        String [] arr2 = {"james", "adam"};
        String [] arr3 = {"bob", "matt", "john"};

        groups[0] = arr1;
        groups[1] = arr2;
        groups[2] = arr3;
        System.out.println(Arrays.deepToString(groups));
    }


}
