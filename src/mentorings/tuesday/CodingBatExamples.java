package mentorings.tuesday;

import java.util.Scanner;

public class CodingBatExamples {

    public static void main(String[] args) {

        /*
        String name = "Nurdin";
        String result = helloName(name);
        System.out.println("The result of first method is :" + result);

        makeAbba("Hi", "Bye");
        */

        /*  <<<Yay>>>  */
        makeOutWord("<<<>>>", "Yay");

        String result = makeAbba("Hi","Bye");
        returnName(result);


    }

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static String helloName(String name) {
        String hello = "Hello ";
        return hello + name + "!";
    }

//Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".

    public static String makeAbba(String a, String b) {
        String result = a + b + b + a;
        return result;
    }

    /*
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word,
    e.g. "<i>Yay</i>".
     */

    public static String makeTags(String tag, String word) {
        String result = String.format("<%s>%s</%s>"
                , tag, word, tag);
        // <i>
        System.out.println(result);
        return String.format("<%s>%s</%s>"
                , tag, word, tag);
    }

    /*
    Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string,
    e.g. "<<word>>". Note: use str.substring(i, j)
    to extract the String starting at index i and going up to but not including index j.
     */
    public static String makeOutWord(String out, String word) {
        System.out.println(out.substring(0, out.length()/2) + word + out.substring(out.length()/2));
        return out.substring(0, out.length()/2) + word + out.substring(out.length()/2);
    }

    public static void returnName(String name){
        System.out.println(name);
    }
}
