package recapwednesdays;

import java.util.Arrays;

public class Methods_Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("march", "charm"));

    }

    public static boolean isAnagram(String str1, String str2){

        //1- Check if both strings have same length
        if(str1.length() != str2.length()){
            return false;
        }
        //2- Create two char array, and store the strings as char arrays
        char [] str1arr = str1.toCharArray(); // march --> m,a,r,c,h
        char [] str2arr = str2.toCharArray(); // charm --> c,h,a,r,m

        //3- sort these arrays
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        //4- check if the two char arrays equals, and return value
        return Arrays.equals(str1arr , str2arr);


    }
}
