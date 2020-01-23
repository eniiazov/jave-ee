package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
        map.put("Forth",4);

        System.out.println("enter a number");
        int number = new Scanner(System.in).nextInt();

        if(!map.containsValue(number)) {
            System.out.println("Invalid number");
            System.exit(0);
        }

        for(String key : map.keySet()) {

            if(map.get(key) == number) {
                System.out.println(key);
                break;
            }

        }



    }
}
