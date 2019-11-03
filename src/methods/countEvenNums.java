package methods;

public class countEvenNums {

    public static void main(String[] args) {
        int [] arr = {3,2,3,5,2,24,5,23,0};
        System.out.println(countEvenNumbers(arr));
    }


    public static int countEvenNumbers(int [] nums) {
        int count = 0;

        for(int num: nums) {
            if(num % 2 == 0) {
                count++;
            }
        }
        return count;
    }


}
