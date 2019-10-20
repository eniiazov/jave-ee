package loops;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class hiInfinite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i == 0 ;) {
          String userInput =  input.nextLine();

          if(userInput.equalsIgnoreCase("hi")) {
                System.out.println("Hello");
          } else if(userInput.equalsIgnoreCase("bye")){
              System.out.println("Good bye");
          } else {
              System.out.println("Bye forever");
              break;
          }

        }

    }
}
