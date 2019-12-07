package recapwednesdays;

import java.util.Arrays;

public class ArraySortExample {

    public static void main(String[] args) {

        //1- Create an array of String called "shows"
        String [] shows = {"Game of Thrones","Prison Break",
                "Friends", "Doctor Who", "Grays Anatomy"};
        //2- Sort the array
        Arrays.sort(shows);
        //3- Print the "sorted list of shows"
        System.out.println("Sorted list of shows:");
        //4- Loop through the array and print out the values
        for(int i=0; i<shows.length; i++){
            System.out.println("#" + i + " " + shows[i] );
        }
    }

}
