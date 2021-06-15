package dev.ranieri.constructors;

// House inherits from Dwelling
public class House extends  Dwelling{

    int walls;

    House(String owner, int area, int walls){
        super(owner,area);// super can be used to build the Parent class first!!!
        // super MUST be the VERY FIRST LINE OF CODE in any constructor
        this.walls = walls;
        System.out.println("Built a house to your specifications");
    }

    House(){
        super();// super() will be automatically called by Java if not written
        System.out.println("Built a house with no arguments");
    }


}
