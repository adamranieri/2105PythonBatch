package dev.ranieri.app;

public class App {

    // main method. Entry point of every Java Application
    // string [] args is how you would pass in command line arguments to a Java application
    public static void main(String [] args) {
        System.out.println("Hello World");
        sayHola();// Java is a compiled language. All code is read before the main method runs
        // you can define methods anywhere

        // Java has primitives. Values that are not connected to a class. ARE NOT OBJECTS
        // 8 primitives
        boolean b = true; // N/A
        byte y = 120;// 1 byte
        char c = 'm'; // 2 bytes support a single character are actually numbers
        short s = 50;// 2 bytes
        int i = 100000;// 4 bytes
        float f = 100.9f; // 4 bytes decimal
        long l = 88888888; // 8 bytes
        double d = 99.572; // 8 bytes decimal

        char cc = 100 + 2; // no problem
        System.out.println(cc); // ascii value

        // Java DOES have object versions of primitives they are called wrappers (wrapper classes)
        Integer j = 90;
        Short k = 8;
        // Encouraged to use Primitives as your default and use wrapper classes only when applicable
//
//        long start = System.nanoTime();
//        for(int g =0;g<100_000;g++){
//            // adding 1 to g 100,000 times
//        }
//        long end = System.nanoTime();
//        System.out.println((end-start)/1000);

        Person adam = new Person("Adam Ranieri", 19);
        System.out.println(adam);

        // new means allocate memory for an object
        // UNLESS you use the word new to create an object you cannot be 100% that you acutally created
        // a new object in memory
        Person tim = new Person("Tim", 30);
        System.out.println(tim);
        adam.introduceSelf();


    }

    static void sayHola(){ // void is the return type means the method does not return anything
        System.out.println("Hola Mundo");
    }

}
