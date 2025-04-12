package ArrayList;

final class ImmutableClassDemo {
    private final String name;
    private final int age;

    public ImmutableClassDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        ImmutableClassDemo immutableClassDemo = new ImmutableClassDemo("Abhi", 23);

        System.out.println(immutableClassDemo.getName() + " "+ immutableClassDemo.getAge());
    }
}
