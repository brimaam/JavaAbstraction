package Problem2Transports.model;

public class Vehicles {
    //variables
    private String vehicleType;
    private double vehiclePrice;

    //constructors
    public Vehicles(){

    }
    public Vehicles(String vehicleType, double vehiclePrice) {
        this.vehicleType = vehicleType;
        this.vehiclePrice = vehiclePrice;
    }

    //getters and setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
}
