package practise.designpattern.factory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        System.out.println();
        String vehicleName = sc.nextLine();
        System.out.println();
        Vehicle vehicle = VehicleFactory.getVehicle(type, vehicleName);
        System.out.println(vehicle.start(vehicleName));
        System.out.println(vehicle.getVehicleName());
    }
}
