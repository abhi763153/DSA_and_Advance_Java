package DesignPattern.Singleton;

import jdk.jfr.Enabled;

public class MainTestinThreadEnv {

    public static void main(String[] args) {


//        Thread t1 = new Thread(()->{
//            President t1p = President.getPresident();
//            System.out.println(t1p.hashCode());
//        });
//        Thread t2 = new Thread(()->{
//            President t2p = President.getPresident();
//            System.out.println(t2p.hashCode());
//        });
//        Thread t3 = new Thread(()->{
//            President t3p = President.getPresident();
//            System.out.println(t3p.hashCode());
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

//        System.out.println(enumSingleton.hashCode());
        enumSingleton.INSTANCE.doSomething();

    }
}
