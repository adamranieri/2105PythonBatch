package practical;

public class Car {

    // static HAS NOTHING to do with access modifiers it is a Class variable
    public static String description = "A Car is a self powered vehicle";

    String make;
    String model;
    private int mileage;

    public Car(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public void driveCar(int miles){
        if(miles <= 0){
            return;// empty return in a void method to end execution immediately
        }
        this.mileage += miles;
    }

    // Static methods CANNOT and should not use the this keyword
    // They tend to be helpful methods that make sense even if no instance of the class exists
    static double convertMilesToKilometers(int miles){
        return miles*1.6;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
