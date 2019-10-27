package loops;

public class nestedLoop {
    public static void main(String[] args) {

//        for(int i=0; i < 5; i++) {
//
//            System.out.println("i is " + i);
//
//            for(int j=0; j < 5; j++) {
//
//                System.out.println("j is " + j);
//
//            }
//            System.out.println();
//        }

      outer:  for(int i= 0; i < 5; i++) {
            System.out.println("outer is " + i);
            inner: for(int j=0; j <= i; j++)  {
                System.out.println("inner is " + j);

                if(j == 2) {
                    break outer;
                }

            }
            System.out.println();
        }

    }
}
