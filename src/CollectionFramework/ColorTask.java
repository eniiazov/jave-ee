package CollectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ColorTask {
    public static void main(String[] args) {

        Set <String> colorOne = new HashSet<>();
        Set <String> colorTwo = new HashSet<>();
        Collections.addAll(colorOne,"red","blue","green","white", "yellow");
        Collections.addAll(colorTwo,"red","yellow","black","white");

        String sameColors = "";

        for(String color: colorOne) {

            if(colorTwo.contains(color)) {
                sameColors += color + " ";
            }

        }

        System.out.println(sameColors);

        System.out.println();
        System.out.println(colorOne);
        System.out.println(colorTwo);



    }
}
