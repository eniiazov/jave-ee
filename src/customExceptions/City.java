package customExceptions;

import customExceptions.Driver;

import java.io.IOException;

public class City {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.setName("kevin");

        try{
            d.setLocation("chica8go");
        }catch (InvalidLocationException e) {
            e.printStackTrace();
        } finally {
            System.out.println(d.getName());
            System.out.println(d.getLocation());
        }








    }
}
