import java.lang.ref.WeakReference;

public class GarbageCollectorExample {


    public static void main(String[] args) {

        Phone apple = new Phone("Iphone", "15 pro");
        WeakReference<Phone>  weakReference = new WeakReference<>(new Phone("Nokia", "216"));
        System.out.println(weakReference.get());
        System.gc();
//        apple = null;

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(weakReference.get());

    }
}

class Phone{
    private String name;
    private String model;


    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
