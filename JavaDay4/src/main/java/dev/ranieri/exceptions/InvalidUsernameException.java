package dev.ranieri.exceptions;

// Any class that inherits from Exception is a checked excption
public class InvalidUsernameException extends Exception{

     InvalidUsernameException(String message){
        super(message); // the RuntimeException class have a single argument string constructor we can use
    }
}
