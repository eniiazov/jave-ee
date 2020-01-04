package polymorphism3;


import java.util.ArrayList;
import java.util.Collections;

public class Park {
    public static void main(String[] args) {

        Animal dog = new GermanShephard();
        String s = dog.type;
        dog.breath();

        Trainable dog2 = new GermanShephard();
         String name = dog2.name;

         Animal joe = new GermanShephard();

//         Dog joe2 = (Dog)joe;
//         GermanShephard joe3 = (GermanShephard)joe2;
         Trainable joe4 = (Trainable) joe;

        ((GermanShephard)joe).bark();




    }







}
