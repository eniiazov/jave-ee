package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class CharOccuTask {
    public static void main(String[] args) {

        String str = "apple";

        Map< String, Integer > map = new HashMap<>();

        for(int i=0; i < str.length(); i++) {

            String key = String.valueOf(str.charAt(i));

            if(!map.containsKey(key)) {
                map.put(key, 1);
                continue;
            }

            map.put(key, map.get(key) + 1);

        }

        System.out.println(map);

    }
}
