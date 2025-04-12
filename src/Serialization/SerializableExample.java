package Serialization;

import java.io.*;

class InstagramAccount implements Serializable{

    private String name;
    private String type;
    private String bio;
    transient String email;

    public InstagramAccount(String name, String type, String bio, String email) {
        this.name = name;
        this.type = type;
        this.bio = bio;
        this.email = email;
    }

    @Override
    public String toString() {
        return "InstagramAccount{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", bio='" + bio + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        InstagramAccount account = new InstagramAccount("Abhishek", "business", "Programmer", "abhi@gmail.com");

        FileOutputStream fileOutputStream = new FileOutputStream("src/Serialization/account.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/Serialization/account.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        InstagramAccount deserializedAccount = (InstagramAccount) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Deserialized instagram account");
        System.out.println(deserializedAccount);


    }
}
