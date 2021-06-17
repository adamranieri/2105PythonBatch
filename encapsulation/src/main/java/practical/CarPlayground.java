package practical;


public class CarPlayground {

    public static void main(String[] args) {
        System.out.println(Car.description);

        Car car = new Car("Subaru", "Crosstrek", 40000);

        System.out.println(car);
        car.driveCar(-2000);
        System.out.println(car);
        car.driveCar(600);
        System.out.println(car);


    }

}
