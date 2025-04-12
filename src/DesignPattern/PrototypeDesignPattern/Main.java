package DesignPattern.PrototypeDesignPattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        Vehicle TwoWheeler = vehicleRegistry.getVehicle("TWO");
        Vehicle TwoWheeler2 = vehicleRegistry.getVehicle("TWO");
        System.out.println(TwoWheeler.hashCode());
        System.out.println(TwoWheeler.getModel());
        System.out.println(TwoWheeler2.hashCode());
        System.out.println(TwoWheeler2.getModel());
    }
}
