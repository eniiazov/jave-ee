package wrapperclasses;

import utilities.MagicNumber;

public class NumberChecker {

    public static void main(String[] args) {
        MagicNumber magicNumber = new MagicNumber();
        magicNumber.generateNumbers(3);
        System.out.println(magicNumber.numbers);

        magicNumber.generateEvens(8);
        System.out.println(magicNumber.numbers);

    }
}
