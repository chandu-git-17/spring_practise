package practise.java8.staticmethods;

public interface Vehicle {

    void start();

    default void stop(){
        System.out.println("Vehicle Stopped");
    }

    static void vehicleInfo(){
        System.out.println("This is a vehicle");
    }

}
