package methods;

public class voidMethods {

    public static void main(String[] args) {
      sayHello();
      sayHello();

    }

    public static void sayHello() {

        for(int i=0; i <5; i++) {
            System.out.println("Hi");
        }
        sayBye();
    }

    public static void sayBye() {
        System.out.println("Bye");
    }

}
