package staticExamples;

public class Mouse {

    String color;
    int size;
    boolean condition;
    boolean wireless;

    public Mouse(String color, int size, boolean wireless, String name){
        System.out.println(name + " is creating a Mouse object");
        this.color = color;
        this.size = size;
        this.wireless = wireless;
    }

    // Overloaded no-argument constructor
    public Mouse(){

    }

}
