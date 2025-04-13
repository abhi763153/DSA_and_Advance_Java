package Stack;


//3 4 5 6 7 8 null

import java.util.Arrays;

public class CustomStack <T>{

    private T[] datasource;
    private int pos;
    private int initialCapacity;

    public CustomStack(){
        this.pos = 0;
        datasource = (T[]) new Object[10];
        this.initialCapacity = 10;
    }

    public CustomStack(int capacity){
        this.pos = 0;
        datasource = (T[]) new Object[capacity];
        this.initialCapacity = capacity;
    }


    public void push(T data) throws Exception {

        if(this.pos >= datasource.length){
            T[] temp = Arrays.copyOf(datasource, datasource.length*2);
            datasource = temp;
        }
        datasource[pos++]=data;
    }

    public T pop() throws Exception {
        if(datasource.length == 0 || pos == 0){
            throw new Exception("Stack is empty! Nothing to pop!");
        }

        T popped = datasource[this.pos-1];
        this.pos--;
        datasource[pos]=null;
        return popped;
    }

    public void print(){
        for (int i=0; i<this.pos; i++){
            System.out.print(datasource[i]+" ");
        }
    }

    public int getSize() {
        return pos;
    }
}
