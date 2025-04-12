package DesignPattern.Singleton;

import java.io.*;

public class BreakingSingletonPatternUsingSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        President president = President.getPresident();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(president);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.obj"));
        President deserializedPresident = (President) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(president.hashCode());
        System.out.println(deserializedPresident.hashCode());
    }
}
