package recapwednesdays;

public class Methods_Palindromes {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String str){

        //1- to create an empty string to store reverse value

        String reverseStr = "";
        //2- create logic to reverse the string & store inside of the above mentioned string
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        //3- return value

        if(!str.equalsIgnoreCase(reverseStr)){
            return false;
        }else
            return true;

    }
}
