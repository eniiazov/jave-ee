package variablesBatch14;

public class Reassignment {
    public static void main(String[] args) {

        int numberOfApples = 10;
        int numberOfOranges = 5;

        System.out.println("Apples: " + numberOfApples);
        System.out.println("Oranges " + numberOfOranges);
        System.out.println();
        numberOfApples = 8;
        numberOfOranges = numberOfApples;

        System.out.println("Apples after: " + numberOfApples);
        System.out.println("Oranges after " + numberOfOranges);
    }
}
