package loops;

import java.util.Scanner;

public class squareNestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

      lines:  for(int i=0; i < num; i++) {

          shape:  for(int j=0; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }


    }
}
