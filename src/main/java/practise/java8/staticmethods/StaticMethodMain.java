package practise.java8.staticmethods;

public class StaticMethodMain {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle.vehicleInfo();
    }

}
