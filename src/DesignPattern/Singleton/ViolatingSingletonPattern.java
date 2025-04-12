package DesignPattern.Singleton;

import java.lang.reflect.Constructor;

public class ViolatingSingletonPattern {

    public static void main(String[] args) throws Exception {

        President p1 = President.getPresident();
        System.out.println(p1.hashCode());

        // 1 - Using reflection API

        Constructor<President> constructor = President.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        President p2 = constructor.newInstance();
        System.out.println(p2.hashCode());

    }
}
