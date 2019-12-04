package stringBuilder;

import utilities.MyCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringBuilderMethods {
    public static void main(String[] args) {
       // System.out.println(deleteWord("this chas con in the middle and con"));

        ArrayList <String> list = MyCollection.randomArrayList(5);
        System.out.println(list);
        System.out.println(insertWord(list,"BYE"));

    }


    public static String deleteWord(String word) {

        StringBuilder sb = new StringBuilder(word);

        int index = sb.indexOf("con");

        if(index >= 0) {
            sb.delete(index,index+3);
        }

        return sb.toString();
    }

    public static String deleteWord(String word, String target) {

        StringBuilder sb = new StringBuilder(word);

        int index = sb.indexOf(target);

        if(index >= 0) {
            sb.delete(index,index+ target.length());
        }

        return sb.toString();
    }

    public static ArrayList <String> insertWord (ArrayList <String> list) {

        for(int i=0; i < list.size(); i++) {

            if(list.get(i).length() % 2 == 0) {

                StringBuilder sb = new StringBuilder(list.get(i));

                sb.insert(list.get(i).length()/2,"HELLO");

                list.set(i,sb.toString());
            }


        }

        return list;

    }

    public static ArrayList <String> insertWord (ArrayList <String> list, String target) {

        for(int i=0; i < list.size(); i++) {

            if(list.get(i).length() % 2 == 0) {

                StringBuilder sb = new StringBuilder(list.get(i));

                sb.insert(list.get(i).length()/2,target);

                list.set(i,sb.toString());
            }


        }

        return list;

    }










}
