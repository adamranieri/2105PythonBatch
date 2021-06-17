package dev.ranieri.exceptions;

import java.util.Scanner;

public class UsernameValidationApp {
    // We are writing a simple app that will allow users to type in a userame
    // A username must be at least 6 characters long
    // A username cannot contain illegal characters #,<,>

    // Exceptions in Java are fundamentally the same as in Python
    // Java does have checked exceptions
    // Python is a language that has ONLY runtime exceptions. These are exceptions that occur in code that
    // hopefully somewhere are caught and handled. But you are not required to handle them
    // checked exceptions are exceptions that are REQUIRED to have code that handles if something goes wrong
    // Your application will not COMPILE if you do not have code for checked exceptions

    // Python   Java
    //try       try
    //except    catch
    //raise     throw
    //finally  finally

    public static void main(String[] args) {
        System.out.println("Welomce to the awesome username validator");
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a username");
        String username = scan.next();

        // Checked Exceptions are called compile time exceptions
        // NOT because they happen at compile time
        // Your code will not compile if there exception handling for it
        try {
             validateUsername(username);
        }catch(InvalidUsernameException e){
            e.printStackTrace();// prints a stack trace to the console
        }catch (Exception e){
            // you can have multiple catch blocks if the method has multiple exceptions it might throw
            // only one catch block is ever executed
            // blocks must be orderd from most specific to least specific exeptions
            e.printStackTrace();
        }
        finally {
            System.out.println("I always run at the end regardless of what happens");
        }
        // There is no golden rule as to what should be runtime exception vs checked exceptions
        // Many languages do not even support checked exceptions
        // If you want to ENFORCE that there is always code to handle the exception then it should be a checked exception
        // If you think it is OKAY that the exception might go unhandled then make it runtime

    }

    // The main purpose of ANY exception is that it is an object containing information about what went wrong

    // throws passes the responsiblity of handling the exception to whoever called the method
    // throws essentially a warning label on the method signature
    // throws is like passive keyword it does not really DO anything
    public static boolean validateUsername(String username) throws InvalidUsernameException{

        if(username.length()< 7){
            // Exceptions are just objects that can be thrown
            InvalidUsernameException invalidUsernameException = new InvalidUsernameException("Username was too short");
            throw invalidUsernameException; // Throw is a 1 to 1 equivalent to raise in Python
        }
        if( username.contains("#") || username.contains("<") || username.contains(">")){
            throw new InvalidUsernameException("Username contained invalid character");
            // Java is freaking out "where is the code that handles this!?!?!?!?!"
            // two ways to handle a checked excpetion
            //1. immediately surround the code in a try catch block
            //2. put a throws keyword On the method signature
            // throws is a formal warning to whoever calls the method. This method might give you this excpetion
            // and you should have code to handle it
        }
        return true;
    }


}
