package InterfacesConcept;

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}


interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class C implements A, B{

    @Override
    public void show(){
        A.super.show();
    }

}
