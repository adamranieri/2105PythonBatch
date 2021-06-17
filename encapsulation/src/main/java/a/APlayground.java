package a;

import practical.Car;

public class APlayground {


    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.pubMethod();
        shape.proMethod();
        shape.defMethod();
        //shape.privMethod();
        shape.otherPubMethod();
        System.out.println(Car.description);
    }



}
