package arrays;

public class reverseEachWord {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String [] words = str.split(" ");

        String finalString = "";


        for(String word: words) {

            String rev = "";

            for(int i= word.length()-1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            finalString += rev + " ";

        }

        System.out.println(finalString);

    }
}
