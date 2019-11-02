package methods;

import java.util.Arrays;

public class addNumbersToString {
    public static void main(String[] args) {
        addNumToString("9843263", 5);
    }

    public static void addNumToString(String number, int add) {
        // 9 8 4 3 2 6 3, 1
        String [] nums = number.split("");

        int [] intArray = new int[nums.length];

        for(int i=0; i < nums.length; i++) {
            intArray[i] = Integer.valueOf(nums[i]) + add;
        }

        System.out.println(Arrays.toString(intArray));


    }


}
