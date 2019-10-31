package arrays;

import java.util.Arrays;

public class splitEx {
    public static void main(String[] args) {
        String str = "Java is programming langauge";
        String [] regular = str.trim().toLowerCase().split(" ");
        char [] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(regular));
    }
}
