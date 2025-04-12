package DesignPattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingletonReflectionAPI {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {


        Constructor[] constructors = President.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        President president = (President) constructor.newInstance();

        President president1 = President.getPresident();

        System.out.println(president.hashCode());
        System.out.println(president1.hashCode());



    }
}
