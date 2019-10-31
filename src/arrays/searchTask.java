package arrays;

import java.util.Arrays;

public class searchTask {
    public static void main(String[] args) {
        int [] nums = {45,23,6,-3,66};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, -3));

    }
}
