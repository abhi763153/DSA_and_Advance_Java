package OOPS;

import java.time.LocalDateTime;

public class Engineer extends Human{

    private String role;

    public Engineer(String name, int age, int salary, boolean married, String role){
        super(name, age, salary, married);
        this.role = role;
    }
    @Override
    public Thought thinking(){
        System.out.println();
        return new Thought("Why everything bad thing happened with me only", "Negative", LocalDateTime.now());
    }
}
