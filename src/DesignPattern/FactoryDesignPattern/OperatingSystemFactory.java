package DesignPattern.FactoryDesignPattern;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){}

    public static OperatingSystem getInstance(String type, String version, String architecture){

        switch (type){
            case "WINDOW":
                return new Window(version, architecture);
            case "LINUX":
                return new Linux(version, architecture);
            default:
                throw new IllegalArgumentException("OS NOT SUPPORTED!");
        }

    }

    public static void main(String[] args){
        OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("LINUX", "3.2", "64 bit");

        System.out.println(operatingSystem.getClass().getName());
        System.out.println(operatingSystem.getArchitecture());
    }

}
