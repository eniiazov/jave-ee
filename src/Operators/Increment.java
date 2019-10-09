package Operators;

public class Increment {
    public static void main(String[] args) {
        int age = 5;

        System.out.println(age); // 5
        System.out.println(++age); //6
        System.out.println(age++); // 6  after > 7
        System.out.println(age);

        int x = 11;
        int y = x++; // int y = 11; then x increments
//        int y = x;
//        x++;

        System.out.println("x=" + x ); // The whole becomes a string, x is not
        System.out.println("y=" + y);   // a number anymore, it is characters


    }
}
