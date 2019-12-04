package stringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }

    public static boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();



        if(str.equals(sb.toString())) {
            return true;
        }


        return false;
    }

}
