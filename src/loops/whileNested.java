package loops;

public class whileNested {

    public static void main(String[] args) {
        int run = 3;
        for(int i= 0; i < 5; i++ ) {
            run = 3;
            while (run != 0) {

                System.out.println(run--);

            }
            System.out.println();
        }
    }
}
