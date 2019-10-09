package Operators;

public class Practice {

    public static void main(String[] args) {

        int book = 10;

        System.out.println(book++); // 10 is printed then incremented -> 11
        System.out.println(++book); // 11 increments -> 12, then it prints

        System.out.println(book); // 12

        System.out.println(book--); // 12 is printed, then it decreased -> 11
        System.out.println(--book);//11 -> 10 then prints

        System.out.println(book); // 10

        System.out.println();
        int x = 3;
        x = x++ * 10; // [3 * 10 == 30. x -> 4 ] - all on the right side
        System.out.println(x);  // why  is x = 30?

        x = x * 10;
        System.out.println(x);

    }


}
