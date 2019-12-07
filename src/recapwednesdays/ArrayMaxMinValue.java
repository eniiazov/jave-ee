package recapwednesdays;

import java.util.Arrays;

public class ArrayMaxMinValue {

    public static void main(String[] args) {

        //1- array called grades
        int [] grades ={15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500, -1};
        //2- 15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500
        //3- print out max and min value

//        Arrays.sort(grades);
//        System.out.println("Min value: " + grades[0]);
//        System.out.println("Max value: " + grades[grades.length-1]);

        int maxValue = 0;
        int minValue = 0;

        for(int i=0; i<grades.length; i++){

            if(maxValue<grades[i]){
                maxValue=grades[i];
            }

            if(minValue>grades[i]){
                minValue=grades[i];
            }
        }

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);

    }
}
