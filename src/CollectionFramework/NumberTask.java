package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumberTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i < 5; i++) {

            numbers.add(input.nextInt());

        }

        Iterator <Integer> it = numbers.iterator();

        while (it.hasNext()) {

            int num = it.next();

            if(num % 2 == 1) {
                it.remove();
            }

        }

        System.out.println(numbers);



    }




}
