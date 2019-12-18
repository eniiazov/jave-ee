package interviewPrep;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static int [] removeDuplicate(int ... arr) {
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i=0; i < arr.length; i++) {
            if(!unique.contains(arr[i])) {
                unique.add(arr[i]);
            }
        }
        return convertArray(unique.toArray());
    }
    private static int [] convertArray(Object [] arr) {
        int [] nums = new int[arr.length];
        for(int i=0; i < arr.length; i++) {
            nums[i] = (int) arr[i];
        }
        return nums;
    }
}