package dev.ranieri.overriding;

public class OverridePlayground {

    public static void main(String[] args) {
        // Overriding is a process where a method Inherited from a parent has its implementation changed
        Parent p = new Parent();
        p.sayHello();

        Child child = new Child();
        child.sayHello(); // child implementation is used

        Parent child2 = new Child(); // Valid assignment becuase a child object CAN be labeled under the parent class
        child2.sayHello(); // Whenever you call a method on an object. The actual object's method is what is used
        // Not what you labelled it as.

    }
}
