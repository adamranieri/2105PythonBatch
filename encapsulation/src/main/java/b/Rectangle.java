package b;

import a.Shape;

public class Rectangle extends Shape {

    public void rectPubMethod(){
        System.out.println("The child class has access to the protected method");
        this.proMethod();//
        //this.privMethod();// Not even the child can access a private method defined in the parent. Even though
        // it is inherited it cannot access it.
    }
}
