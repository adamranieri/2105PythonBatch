package dev.ranieri.object101;

import dev.ranieri.exceptions.InvalidUsernameException;

public class ObjectPlayground {

    public static void main(String[] args) {
        // The Object Class is the grandfather root class of EVERYTHING in Java
        // Every Object is of type Object

        Object s = "Hello";
        Integer i = 19;

        // few key methods on the Object class
        // toString() returns the string representation of an object
        // probably the most overridden method in all of Java. Return the memory address by default
        Object o= new Object();

        // equals() a method that returns trye or false if one the implementation says so
        // by default it compares memeory addresses
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));

        // hashcode() a method that returns a number generated from the fields in a class
        // It is used to identify the state of an object but is one way operations
        // you cannot reconstruct the intial values based off of a hashcode
        String s3 = "Wasssup";
        System.out.println(s3.hashCode());

    }
}
