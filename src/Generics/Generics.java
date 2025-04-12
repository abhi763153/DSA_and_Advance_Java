package Generics;

class LeagacyBox<T>{

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

public class Generics {

    public static void main(String[] args) {

        LeagacyBox<String> leagacyBox = new LeagacyBox();

        leagacyBox.setObject("Aman");

        String a = leagacyBox.getObject();

        System.out.println(a);
    }
}
