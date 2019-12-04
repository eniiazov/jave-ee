package finalAndMemory;

public class Bag {

    final String color;
    final int size;

    static final String model;

    static {
        model = "MK";
    }


    {
        size = 4;
    }

    public Bag(){
        this.color = "Red";
    }

    public Bag(String color){
        this.color = color;
    }

    // final instance variable must be initialized
    // Once it is initialized then value for the color cannot be changed

    // Option 1: Initialize it right away. Give a value when declaring the
    // instance variable

    // Option 2: Initialize it within the constructor. Because instance variables
    // cannot be used without creating an object. If we use constructor
    // to initialize the FINAL INSTANCE VARIABLE, it allows.

    // Option 3: Instance initializer block. It is used to initialize instance
    // variables. It is same as static block but it's for non-static variables.
    // Instance initializer block gets executed right before constructor.

    // Why to use initializer block?
    // - We could be running few different codes to bring a value to initialize
    // In initializer block we can write any code. But we can't write any
    // code at instance variable level.




}
