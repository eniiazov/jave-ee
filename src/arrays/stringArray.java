package arrays;

import java.util.Arrays;

public class stringArray {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "jamie";
        names[1] = "boB";
        names[2] = "nemo";
        System.out.println(Arrays.toString(names));

        System.out.println(names[1].charAt(0));
        System.out.println(names[2].charAt(0));

        names[1] = names[1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
        System.out.println(names[1]);

        System.out.println(names.length);
    }
}
