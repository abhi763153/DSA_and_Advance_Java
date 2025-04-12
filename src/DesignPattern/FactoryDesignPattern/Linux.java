package DesignPattern.FactoryDesignPattern;

public class Linux extends OperatingSystem{

    public Linux(String version, String architecture) {
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
