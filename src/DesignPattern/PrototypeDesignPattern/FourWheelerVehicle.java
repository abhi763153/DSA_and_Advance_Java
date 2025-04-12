package DesignPattern.PrototypeDesignPattern;

public class FourWheelerVehicle extends Vehicle{
    private boolean isAutomatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, Long price, boolean isAutomatic, boolean isDiesel) {
        super(engine, model, price);
        this.isAutomatic = isAutomatic;
        this.isDiesel = isDiesel;
    }

    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        return "FourWheelerVehicle{" +
                "isAutomatic=" + isAutomatic +
                ", isDiesel=" + isDiesel +
                '}';
    }
}
