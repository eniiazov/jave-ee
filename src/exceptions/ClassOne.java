package exceptions;

import stringBuilder.Ex;

public class ClassOne {

    public static void main(String[] args) {

        try{
            String s = "hello";
            System.out.println(s.charAt(3));
            System.out.println(3);
            System.out.println(new int []{3,21,1}[5]);
        } catch (StringIndexOutOfBoundsException  | ArrayIndexOutOfBoundsException e ) {
            System.out.println("Index does not exist");
        } catch (ArithmeticException e) {
            System.out.println("Invalid math");
        } catch (Exception e) {
            System.out.println("Unknown exception");
            System.out.println(e.toString());
        }

        try{
            Thread.sleep(1000);
            Dog d=  null;
            int a= d.age;
        }catch (InterruptedException e) {

        } catch (NullPointerException e) {

        }




        System.out.println("The end");
    }
}
