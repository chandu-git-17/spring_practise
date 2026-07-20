package practise.designpattern.factory;

public class Bike implements Vehicle{
    public String vehicleName;
    public String start(String bikeType){
        return new String(bikeType + " has started");
    }
    public Bike(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public String getVehicleName(){
        return vehicleName;
    }
}
