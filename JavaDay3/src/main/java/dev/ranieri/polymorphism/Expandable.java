package dev.ranieri.polymorphism;

// Interface vs Abastract class
// ALL methods in an interface are abstract
// Interfaces do not have constructors
// Interfaces cannot have instance varaibles // public static final variables
// A single class can implement MANY interfaces
// A single class can only inherit/extend a single class (abstract or otherwise)
// Interfaces tend to be more flexible
public interface Expandable {

    void expandCreditLimit(double amount);

}
