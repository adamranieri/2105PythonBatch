package dev.ranieri.overriding;

// by using extends our Child class will inherit all methods and fields from the Parent class
public class Child extends Parent{

    // Overidden method
    // SAME EXACT METHOD signature as the parent's method
    // Same name, same return type, same parameters
    @Override // Optional annotation that will give you an error if the method IS NOT overrding something
     void sayHello(){
         System.out.println("I am the Child Implementation of the sayHello method");
     }
}
