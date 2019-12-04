package finalAndMemory;

public class GC {

    public static void main(String[] args) {
        Bag bag = new Bag();
        Bag bag1 = new Bag();
        String s = "";

        bag = bag1;

        System.out.println("hey what yp");

        System.out.println("End of program");
        System.gc();


    }
}
