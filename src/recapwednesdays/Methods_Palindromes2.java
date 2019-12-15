package recapwednesdays;

public class Methods_Palindromes2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("anda"));

    }

    public static boolean isPalindrome2(String str){
        //CIVIC

        /*
                    i               j
                    0               4
                    1               3 --> last line to be executed because of while loop condition
                    2               2
         */

        int start= 0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
