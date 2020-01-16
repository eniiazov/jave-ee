package CollectionFramework;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Joe");
        names.add("Sara");
        names.add("Ben");
        names.add("Adam");

        Iterator <String> it = names.iterator();

        while (it.hasNext()) {

            String name = it.next();
            System.out.println(name);

            if(name.equals("Ben")) {
                it.remove();
            }

        }

        System.out.println(names);



    }
}
