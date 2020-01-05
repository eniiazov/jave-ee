package customExceptions;

import inheritancePart2.Laptop;

public class LaptopNotTurningOnException extends RuntimeException{

    public LaptopNotTurningOnException() {

    }

    public LaptopNotTurningOnException(String message) {
        super(message);

    }

}
