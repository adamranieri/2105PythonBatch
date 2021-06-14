# Java
- Developed Sun Microsystems in 1995
- Designed Scalability and Eneterprise level applications
    - Very structured and strict language
    - Was designed not so much for fun programming like Python

## Core Features of Java
- Automatic memory management
    - Programming bugs that involved Pointers were a MASSIVE time loss in development
    - Those time loses and failed project cost companies untold million
    - Java has NO POINTERS and has a garbage collector
- WORA (Write Once Run Anywhere)
    - You could write a Java application on one machine and reliably run it on any other machine
    that had Java.
    - All Java versions are backwards compatible
        - You could write an application in Java today and get it to run on Java v 1.1
    - JVM (Java Virtual Machine)
- Compiled
    - The entire code is read and then turned into byte code to be executed by the JVM
    - In contrast Python is a Intepreted language that runs and executes line by line at the same time
    - Java can perform optimizations to your compiled code
    - Java can perform additional type and safety checking
    - Java Source code is written in .java files
    - The compiled byte code for machines is put in .class files
        - These .class files are NOT meant to read by humans
        - Acutally a form of Java Assembly code (THERE IS ZERO SECUITY)
- OOP (Object Oriented Programming)
    - Java is a very OOP
    - Everything is in a class 
    - Java code was designed to be as modular and interchangeable as possible

## Syntax of Java
- Strongly typed
    - No implcity type coercion
- Statically typed
    - All variables must be given a type
    - All methods must have defined return type
- Everything is a class
- Java does have primitive types that ARE NOT objects the 1% of Java that is not OOP 
    - Java 8 added lambdas for functional programming
- All Java application start at the main method without exception!
     ```java
    public static void main(String [] args){

    }
    ```
    - Different from Python where you can start a program by executing any file and it executes top to bottom
    - Your application could have multiple mains (I have never seen a real application do this)

## Scopes In Java
- Class/static
    - Static Python class scope
- Instance
- Method
- Local/block


