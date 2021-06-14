package dev.ranieri.app;

public class Person {

    // static variables and methods belong to the class itself
    // Essentially class variables in Python
    static int counter = 0;

    // instance variables
    String name;
    int age;


    // Constructors in Java are not __init__ or a specific keyword
    // A method with the SAME EXACT name as the class
    // Constructors are the ONLY methods in Java to NOT have a return Type
    Person(String name, int age){
        this.name = name;
        this.age = age;
        Person.counter += 1; // You can access class variables just like in Python
        // counter += 1; // You can omit the class name so long as it is unambiguous in the code
    }

    public void introduceSelf(){
        System.out.println("Hi my name is " + this.name);
    }

    //toString is like __str__ in Python.
    // String representation of an abject
    @Override // Annotation. Annotations cannnot directly impact code
    // @Override is optional
    // throws an error if the method is NOT overriding something
    // but is not needed to actually override something
    // @ in python vs Java are VERY DIFFERENT in functionality
    public String toString(){
        return "Name: " + this.name +" Age: " + this.age;
    }

}
