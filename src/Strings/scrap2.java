package Strings;

public class scrap2 {
    public static void main(String[] args) {

        String vowel = "a e i o u";
        boolean check = false;
        String word = "ppel";
        word =  word.toLowerCase();

        for(int i=0; i < word.length(); i++) {
            String c = word.charAt(i) +  "";
            if(vowel.contains(c)) {
                check = true;
                break;
            }
        }
        System.out.println(check);

    }
}
