package dev.ranieri.constructors;

// if you have NO constructors in a class you get a DEFAULT constructor
// The default constructor takes in NO arguments
public class Dwelling {

    String owner; // objects with no value are null
    int area; // primitives with no value are 0

//    // __str__
//    public String toString(){
//        return "Owner :" +this.owner +" Area: " + this.area;
//    }
    // Constructors must be named the same as the class and have no return type
    // Constructors CAN be overloaded
    Dwelling(String owner, int area){
        System.out.println("Building a dwelling to your specifications");
        this.owner = owner;
        this.area = area;
    }

    Dwelling(){
        System.out.println("Building a generic dwelling");
        this.owner = "Jason McDeveloper";
        this.area = 100;
    }


    @Override
    public String toString() {
        return "Dwelling{" +
                "owner='" + owner + '\'' +
                ", area=" + area +
                '}';
    }
}
