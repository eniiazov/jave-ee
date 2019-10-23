package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        // james
        String rev = ""; // semaj

        for(int i= word.length()-1; i >= 0; i--) {
            rev += word.charAt(i); // rev = rev + word.charAt(i);
           // System.out.print(word.charAt(i));
        }

          System.out.println(rev);
    }
}
