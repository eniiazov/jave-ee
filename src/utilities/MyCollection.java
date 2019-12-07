package utilities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyCollection {

    public static String name;
    public int age;

    private MyCollection(){

    }

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

    public static ArrayList<String> randomArrayList(int elements) {
        ArrayList <String> words = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < elements; i++) {
            int size = random.nextInt(10) + 1;
            String temp = "";
            for(int j= 0; j < size; j++) {
                int characters = random.nextInt(23) + 65;
                temp += (char)characters;
            }
            words.add(temp.toLowerCase());
        }
        return words;
    }



}
