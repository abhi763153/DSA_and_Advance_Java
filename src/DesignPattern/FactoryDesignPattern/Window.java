package DesignPattern.FactoryDesignPattern;

public class Window extends OperatingSystem{

    public Window(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public String changeDir(String dir) {
        return "";
    }

    @Override
    public String removeDir(String dir) {
        return "";
    }
}
