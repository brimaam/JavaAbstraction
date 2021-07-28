package Problem2Transports.controller;


import Problem2Transports.model.VehicleCosts;
import Problem2Transports.model.Vehicles;

public class ChooseVehicle implements VehicleCosts {

    public static void main(String[] args) {
        double budget = 500;

        Vehicles vehicles[] = createVehicleArray();

        System.out.println("Which vehicles can Xiaoming take to go from Wuhan to Beijing?\n");

        //checks if budget is enough to take which vehicle to beijing.
        for(int i=0;i <vehicles.length-1;i++){
            if (vehicles[i].getVehiclePrice() <= budget){
                System.out.println("Xiaoming can take a " + vehicles[i].getVehicleType() + " to go Beijing from Wuhan.");
            }
        }
    }

    //instantiates an array of types of vehicles and its price of transportations.
    public static Vehicles[] createVehicleArray(){
        Vehicles vehicles[] = new Vehicles[4];
        vehicles[0] = new Vehicles("CAR", CAR_YUAN);
        vehicles[1] = new Vehicles("BUS", BUS_YUAN);
        vehicles[2] = new Vehicles("TRAIN", TRAIN_YUAN);
        vehicles[3] = new Vehicles("PLANE", PLANE_YUAN);
        return vehicles;
    }
}
