package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Honda");

//        List<String> car2 = new ArrayList<>(cars);
//
//        System.out.println(car2);

        for (String car: cars) {
            System.out.println(car);
        }




    }
}
