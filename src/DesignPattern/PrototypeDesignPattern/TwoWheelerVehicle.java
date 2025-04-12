package DesignPattern.PrototypeDesignPattern;

public class TwoWheelerVehicle extends Vehicle {

    private boolean isElectric;

    public TwoWheelerVehicle(String engine, String model, Long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "TwoWheelerVehicle{" +
                "isElectric=" + isElectric +
                '}';
    }
}
