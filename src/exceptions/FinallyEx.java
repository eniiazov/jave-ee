package exceptions;

public class FinallyEx {
    public static void main(String[] args) {
        String s= "";
        try{
          s  = "cybertek";
            System.out.println(s.substring(30));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index doesn't exist");


        } finally {

            System.out.println("The string was " + s);
        }


    }
}
