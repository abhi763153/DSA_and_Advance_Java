package OOPS;

public class SingleTonClass {

    private  SingleTonClass(){}

    private static SingleTonClass instance;
    public static SingleTonClass getInstance(){

        if(instance == null){
            instance = new SingleTonClass();
        }

        return instance;
    }
}
