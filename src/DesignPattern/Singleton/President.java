package DesignPattern.Singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class President implements Serializable {

    private static President president;

    private President(){
//        if(president != null){
//            throw new RuntimeException("You are tyring to break the singleton pattern");
//        }
        System.out.println("President instance created: " + this);
    }

    public synchronized static President getPresident(){

        if(president == null){
            synchronized (President.class){
                if(president == null){
                    president = new President();
                }
            }
        }

        return president;
    }

    protected Object readResolve(){
        return president;
    }
}
