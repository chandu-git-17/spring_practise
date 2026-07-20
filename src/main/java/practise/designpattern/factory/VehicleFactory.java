package practise.designpattern.factory;

import java.util.Objects;

public class VehicleFactory {
    public static Vehicle getVehicle(String type, String name){
        if(Objects.equals(type, "CAR")){
            System.out.println("This is a car object");
            return new Car(name);
        }
        else if (Objects.equals(type, "BIKE")) {
            System.out.println("This is a Bike object");
            return new Bike(name);
        }
        else{
            System.out.println("This is a Truck object");
            return new Truck(name);
        }
    }
}
