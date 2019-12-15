package recapwednesdays;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Methods_CountWords {

    public static void main(String[] args) {
        countWords();
    }

    public static void countWords(){
        //1- Print out the intro sentence
        System.out.println("Please enter a sentence to be analyzed: ");

        //2- Accept a String from the user
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //3- Create a logic to process the String: split the String and store
            //in another variable

        String [] words = sentence.split(" ");

        //4- Print out the elements of the String array
        System.out.println("Words in this String are as followed: " + Arrays.toString(words));
        //5- Print out the length of the String array
        System.out.println("Number of words in this sentence are: " + words.length);
    }
}
