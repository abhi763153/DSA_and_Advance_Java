package DesignPattern.PrototypeDesignPattern;

class Marksheet {
    public int math;
    public int phy;
    public int chem;

    public Marksheet(int math, int phy, int chem) {
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "math=" + math +
                ", phy=" + phy +
                ", chem=" + chem +
                '}';
    }
}

class Student implements Cloneable{
    public String name;
    public Marksheet marksheet;

    public Student(String name, Marksheet marksheet) {
        this.name = name;
        this.marksheet = marksheet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marksheet=" + marksheet +
                '}';
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        var marksheet = new Marksheet(98, 78, 56);
        Student abhi = new Student("Abhishek", marksheet);


        Student roc = (Student) abhi.clone();
        roc.marksheet.math=30;

//      System.out.println(abhi.hashCode() + " -- " + roc.hashCode());
        System.out.println(roc.marksheet.hashCode());
        System.out.println(abhi.marksheet.hashCode());

    }
}

