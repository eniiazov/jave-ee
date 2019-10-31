package loops;

public class shapes {
    public static void main(String[] args) {

        for(int i=1; i <= 4; i++) {

            for(int z = 4-i; z > 0; z--) {
                System.out.print(" ");
            }

            for(int y = 1+1; y <= i*2; y++ ) {
                System.out.print("*");
            }

            System.out.println();

        }

        // Top

        for(int i=1; i <= 4-1; i++) {

            for(int z = 1; z < 4; z++) {
                System.out.print(" ");
            }

            for(int y = 6; y <= 2 * (7-i); y++ ) {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}
