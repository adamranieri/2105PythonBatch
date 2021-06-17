package a;

// Encapsualtion is how we protect data an methods from other parts of the code
// why bother? In large applications you want to make sure that other developers use the code as intended.
// if you have a variable that if edited broke the application why allow other parts of the code to access it

// Java achieves encapsulation through access modifiers
// these are keyword which limit the visibility of a method or variable
// ACCESS MODIFIERS ARE NOT SCOPES!!!!!!!!!!!
public class Shape {

    // Least restrictive
    // You can use public methods anywhere
    public void pubMethod(){
        System.out.println("Hi I am a Public method you can use me anywhere!!!!!");
    }

    // protected = default + child classes
    protected void proMethod(){
        System.out.println("I am the protected method. I can be used anywhere in the package AND in child classes anywhere");
    }

    //  you can use default methods if in the same package
    void defMethod(){
        System.out.println("I am the default method you can use me in this package only");
    }

    // most restrictive
    // you can only call me in this class
    private void privMethod(){
        System.out.println("Hi I am the private method. You can only call me within this class");
    }

    public void otherPubMethod(){
        System.out.println("I can call the private method in my code block");
        this.privMethod();
    }



}
