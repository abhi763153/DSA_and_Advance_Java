package OOPS;

public class Main {

    public static void main(String[] args) {

        Engineer engineer = new Engineer("Abhishek", 23, 23000, false, "Java backend engineer");

        System.out.println(engineer.thinking());









//        Human rockey = new Human("Rockey", 24, 20000, false);
//        Human Naresh = new Human("Naresh", 25, 30000, true);
//
//        Main a = new Main();
//        System.out.println(Human.population);
//
//        a.greet();

//        SingleTonClass obj = SingleTonClass.getInstance();
//
//        SingleTonClass obj1 = SingleTonClass.getInstance();
//
//        SingleTonClass obj2 = SingleTonClass.getInstance();
//
//
//        System.out.println(obj==obj1);
//        System.out.println(obj1==obj2);

//        Planet earth = new Earth(23, 34, true, "Sun");
//        earth.moving();
//        earth.findWater();

//        Planet mars = () -> {
//            System.out.println("Finding water...");
//            return 343532;
//        };
//
//        System.out.println(mars.findWater());


    }

    void greet(){
        System.out.println("Hello Abhishek");
    }
}
