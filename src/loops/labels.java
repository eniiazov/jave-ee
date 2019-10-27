package loops;

public class labels {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
            inner:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue inner;
                }

                if (i == 3) {
                    break outer;
                }
                System.out.println("j is " + j);
            }
            System.out.println();
        }
    }
}
