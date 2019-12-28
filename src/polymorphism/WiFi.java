package polymorphism;

public interface WiFi {


    public abstract void searchWiFi();

    public static void m(){
        System.out.println("Static Method");
    }

    public default void d(){

    }

}
