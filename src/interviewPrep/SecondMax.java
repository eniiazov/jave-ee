package interviewPrep;

public class SecondMax {

    public static int secondMaxNumber(int ... arr) {
        int max = arr[0];
        int second = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max) {
                second = max;
                max = arr[i];
            }
            if(arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        return second;
    }
}
