package practise.designpattern.factory;

public class Car implements Vehicle{
    public String vehicleName;
    public String start(String carName){
        return new String(carName + " started");
    }
    public Car(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public String getVehicleName(){
        return vehicleName;
    }

}

