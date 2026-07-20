package practise.designpattern.factory;

public class Truck implements Vehicle{
    public String vehicleName;
    public String start(String truckType){
        return new String(truckType+ " has started");
    }
    public Truck(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public String getVehicleName(){
        return vehicleName;
    }
}
