package DesignPattern.PrototypeDesignPattern;


class Marksheet1 implements Cloneable{
    public int math;
    public int phy;
    public int chem;

    public Marksheet1(int math, int phy, int chem) {
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    protected Object clone() throws CloneNotSupportedException{
        return new Marksheet1(this.math, this.phy, this.chem);
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

class Student1 implements Cloneable{
    public String name;
    public Marksheet1 marksheet;

    public Student1(String name, Marksheet1 marksheet) {
        this.name = name;
        this.marksheet = marksheet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student1 cloned = (Student1) super.clone();
        cloned.marksheet = (Marksheet1) this.marksheet.clone();

        return cloned;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marksheet=" + marksheet +
                '}';
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        var marksheet = new Marksheet1(98, 78, 56);
        Student1 abhi = new Student1("Abhishek", marksheet);


        Student1 roc = (Student1) abhi.clone();
        roc.marksheet.math=30;

//      System.out.println(abhi.hashCode() + " -- " + roc.hashCode());
//        System.out.println(roc.marksheet.hashCode());
//        System.out.println(abhi.marksheet.hashCode());

        System.out.println(abhi.marksheet.math);
        System.out.println(roc.marksheet.math);

    }
}

