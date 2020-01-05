package customExceptions;

public class InvalidOSException  extends Exception{

    public InvalidOSException() {

    }

    public InvalidOSException(String message){
        super(message);
       // System.err.println(  this.toString() + " " + message);
    }



}
