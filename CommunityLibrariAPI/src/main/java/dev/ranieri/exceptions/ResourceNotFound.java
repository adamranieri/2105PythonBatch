package dev.ranieri.exceptions;

// if this is a runtime exception there is no guarantee that it is caught and handled somewhere
// if this is a checked exception it MUST be handled before leaving java
public class ResourceNotFound extends RuntimeException{

    public ResourceNotFound(String message){
        super(message);
    }
}
