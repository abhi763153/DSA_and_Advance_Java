package Multithreading;

class Pen{

    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" "+" is using pen "+ this + " and trying to acquire paper class object "+ paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+"Finish writing in "+this);
    }
}

class Paper{

    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName()+" "+" is using paper "+ this + " and trying to acquire paper class object "+pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+"Finish writing in "+this);
    }
}

class Thread1 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Thread1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.writeWithPenAndPaper(pen);
    }
}

class Thread2 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Thread2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (paper){
            pen.writeWithPenAndPaper(paper);
        }
    }
}


public class DeadlockExample {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();


        Thread t1 = new Thread(new Thread1(pen, paper), "Thread - 1");
        Thread t2 = new Thread(new Thread2(pen, paper), "Thread - 2");

        t1.start();
        t2.start();

    }
}
