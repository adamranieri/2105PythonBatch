package dev.ranieri.lambdas;

// Steps to create a custom lambda
// 1. make a functional interface (an interface with one and ONLY one method)
@FunctionalInterface// does not do anything other than throw an error if you add another method
public interface Calculate {

    double calc(double num1, double num2);

}
