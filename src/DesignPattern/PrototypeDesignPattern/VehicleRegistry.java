package DesignPattern.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private static Map<String, Vehicle> mapVehicle = new HashMap<>();

    static {
        mapVehicle.put("TWO", new TwoWheelerVehicle("200 cc", "N1 200", 200000L, false));
        mapVehicle.put("FOUR", new FourWheelerVehicle("20 HP", "Thar", 1600000L, false, true));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        System.out.println(mapVehicle.get(vehicle).hashCode());
        return mapVehicle.get(vehicle).clone();
    }
}
