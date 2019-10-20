package loops;

public class evenOrOdd {
    public static void main(String[] args) {

        for(int i= 0; i <= 50; i++) {

            if(i == 20) {
                i = 29;
                continue;
            }
//
//            if(i == 40) {
//                break;
//            }

            if(i % 2 == 1) {
                System.out.println(i);
            } else {
                System.out.println("Even number here");
            }



        }

//        for(int i= 1; i < 50; i += 2) {
//            System.out.println(i);
//        }


    }
}
