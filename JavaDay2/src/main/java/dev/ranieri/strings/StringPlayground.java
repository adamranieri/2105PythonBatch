package dev.ranieri.strings;

public class StringPlayground {

    public static void main(String[] args) {
        // Strings are immutable objects in Java
        // they cannot be edited once created
        // One of the few Objects that can be created using literal syntax i.e. NOT using new

        String s = "HELLO";
        System.out.println(s.toLowerCase()); // method returns a BRAND NEW string
        System.out.println(s);
        s = s + " WORLD"; // creates a brand new string "HELLO WORLD". Just a reassignment
        System.out.println(s);
        // Strings in Memory "HELLO", "WORLD", "HELLO WORLD", "hello"
        // Java has a STRING POOL which allows strings of the same value to be the same object
        // This is to optimize memory
        // all objects have a .equals() that returns true or false if two objects are equal via some logical comparison
        // written into the method
        // == is used to check if two objects are the SAME EXACT Object

        String name1 = "Adam";
        String name2 = "Adam";
        String name3 = new String("Adam"); // new guaratees that you create a new object in memory

        System.out.println(name1.equals(name2)); // true
        System.out.println(name1 == name2); // true

        System.out.println(name1.equals(name3)); // true
        System.out.println(name1 == name3); // false is operator in Python

        // StringBuilder is the mutable version of strings that are designed for string manipulation
        // Preferable if you have do a bunch of string operations
        // StringBuilders do not use a string pool
        StringBuilder sb = new StringBuilder("aaaaaabbbbbbbccccccc");
        sb.reverse();
        System.out.println(sb);

        String a = "a";
        StringBuilder b = new StringBuilder("b");

        long start = System.nanoTime();
        for( int i =0; i<10000;i++){
            a = a + "a"; // create a new string every single time "a", "aa", "aaa", "aaaa"
        }
        long end = System.nanoTime();
        System.out.println("String reassignment: " + (end-start));

        start = System.nanoTime();
        for(int i =0; i<10000;i++ ){
            b.append("b");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder append: " + (end-start));

//        for(char c : "fsdfewfewf".toCharArray()){
//            System.out.println(c);
//        }



    }
}
