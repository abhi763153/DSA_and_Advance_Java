package OOPS;

@FunctionalInterface
public interface Planet {
     String shape = "Sphere";

    int findWater();

     static void revolving(){
         System.out.println("Planets are revolving around the sun");
     }

     default void moving(){
         System.out.println("All the planets moving because universe is expanding.");
     }

}
