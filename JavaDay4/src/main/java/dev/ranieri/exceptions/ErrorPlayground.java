package dev.ranieri.exceptions;

public class ErrorPlayground {

    // Exceptions and Errors are similar but mean different things in Java
    // Exceptions and Errors are both children of throwable which is the top of the exception hierarchy
    // Exceptions are for when things go wrong that your program should be able to handle
    // Errors are for catastrophic fundamental failures that you shoould not catch or handle
    // If you are reciving errors. You need to rewrite the code or the problem is not solveable via a programming
    // Errors OutOfMemoryError
    // StackOverflowError
    public static void main(String[] args) {
        try {
            recursive();
        }catch (StackOverflowError error){
            System.out.println("You can catch errors but it is INCREDIBLY BAD PRACTICE");
        }

        try {
            terrible();
        }catch (Throwable e){
            System.out.println("YOU CAN CATCH COMPILER ERRORS IN JAVA");
        }

    }

    public  static void recursive(){
        recursive();
    }

    public static void terrible(){
//        askdjlfnawefnjawnlffnwluefnaw laksjjdnflwenfoawefunaowefunf
//        fauywefiuaywbefiauwb uneifunwiefunewwef
    }
}
