package dev.ranieri.constructors;

public class Estate extends House{

    String fancyName;

    // the process is called constructor chaining where a child must call the parent as the first line of the constructor
    // Since Java DOES NOT support multiple inheritance there is no grandfather problem
    Estate(String owner, int area, int walls, String fancyName){
        super(owner, area, walls);
        this.fancyName = fancyName;
        System.out.println("Built the luxious fancy manor called "+this.fancyName);
    }
}
