package recapwednesdays;

import java.util.Arrays;

public class ArrayReverseWordsInSentence {

    public static void main(String[] args) {

        //1- Create a string
        String sentence = "We went to picnic today";
        //2- Split the array of string we have and store it in a new array
        String [] words = sentence.split(" ");
        String reversedSentence = "";
        //3- Create a logic to reverse each word
        System.out.println(Arrays.toString(words));
        // handle each word one by one
        for(String word: words){

            for(int i=word.length()-1; i>=0; i--){
                reversedSentence += word.charAt(i);
            }
            reversedSentence += " ";
        }
        //4- We can print out the values

        System.out.println(reversedSentence.trim());


    }

}
