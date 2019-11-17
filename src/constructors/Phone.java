package constructors;

public class Phone {

    //Instance variables: touchscreen, model, memory, color, phoneNumber.
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public Phone(String model, String color, int memory, boolean touchscreen){
        this(model, color);
        this.touchscreen = touchscreen;
        if(memory < 0){
            System.out.println("\nInvalid Memory");
        }
        else{
            this.memory = memory;
        }
    }

    public void info(){
        System.out.println("\nPhone number: " + this.phoneNumber);
        System.out.println("Model: " + model);
        System.out.println("Memory: " + this.memory);
        System.out.println("Color: " + this.color);
        System.out.println("TouchScreen: " + this.touchscreen);
    }

    public boolean text(long phoneNumber, String message){
        String pString = phoneNumber+"";
        if(pString.length() == 10 && !message.isEmpty()){
            System.out.println(message + " is sent to " + phoneNumber);
            return true;
        }
        else{
            System.out.println("Invalid phone number of empty message");
            return false;
        }
    }

    public void call(long phoneNumber){
        String pString = phoneNumber+"";
        if(pString.length() == 10){
            System.out.println("Calling to " + phoneNumber);
        }
        else{
            System.out.println("Invalid Phone number.");
        }
    }

}
