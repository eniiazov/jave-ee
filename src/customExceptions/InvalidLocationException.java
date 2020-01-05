package customExceptions;

public class InvalidLocationException extends Exception{

    public InvalidLocationException() {

    }

    public InvalidLocationException(String message) {
        super(message);
    }

}
