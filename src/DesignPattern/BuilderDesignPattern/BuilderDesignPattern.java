package DesignPattern.BuilderDesignPattern;


class Car {
    private String engine;
    private int wheels;
    private boolean airbag;
    private boolean isACed;

    // Private constructor to enforce object creation via Builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airbag = builder.airbag;
        this.isACed = builder.isACed;
    }

    public void showCarDetails() {
        System.out.println("Engine: " + engine + ", Wheels: " + wheels + ", Airbag: " + airbag + ", Air Condition: "+ isACed);
    }

    // Static Builder Class
    public static class CarBuilder {
        private String engine;
        private int wheels;
        private boolean airbag;
        private boolean isACed;

        public CarBuilder(String engine, int wheels) {  // Mandatory attributes
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setAirbag(boolean airbag) {   // Optional attribute
            this.airbag = airbag;
            return this;
        }

        public CarBuilder setAC(boolean isACed){
            this.isACed = isACed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}


public class BuilderDesignPattern {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("V8", 4)
                .setAirbag(true)
                .setAC(true)
                .build();
        car.showCarDetails();
    }
}
