package recapwednesdays;

import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {

        //1- Create a String of arrays called groceryList: apple, carrot, orange, cherry, strawberry
        String [] groceryList = {"apple","carrot","orange","cherry","strawberry"};

        //2- Sort the array
        Arrays.sort(groceryList);

        //3- Print out the index numbers of apple and orange
        System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
        System.out.println("Index number of orange is: " + Arrays.binarySearch(groceryList, "orange"));
    }
}
