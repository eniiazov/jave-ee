package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

    /**
     * This method creates list of Strings from the User.
     * Method doesn't take anything. It uses Scanner to fill the list
     * @return ArrayList of String
     */
    public static ArrayList<String> getStringList(){
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter Word:");
            words.add(scanner.nextLine());
            System.out.println("Are you done? Y/N");
            if(scanner.nextLine().equals("Y")){
                break;
            }
        }
        return words;
    }


    public static ArrayList<String> filterList(ArrayList<String> words, int size){
        ArrayList<String> newWords = new ArrayList<>();
        for(String s: words){
            if(s.length() == size){
                newWords.add(s);
            }
        }
        return newWords;
    }


    public static ArrayList<String> removeDuplicates(ArrayList<String> words){
        ArrayList<String> newWords = new ArrayList<>();
        for(String s: words){
            if(newWords.contains(s)){
                continue;
            }
            newWords.add(s);
        }
        return newWords;
    }



}
