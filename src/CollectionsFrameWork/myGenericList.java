package CollectionsFrameWork;

import java.util.Iterator;

public class myGenericList<T> implements Iterable<T>{

    private T[] arr;
    private int size;

    public myGenericList(){
        this.arr = (T[]) new Object[100];
        this.size = 0;
    }

    public void add(T val){
        arr[size++] = val;
    }

    public T get(int i){
        return arr[i];
    }

    public Iterator<T> iterator(){
        return new myGenericIteratorClass<>(this);

    }

    private class myGenericIteratorClass<T> implements Iterator<T>{

        myGenericList<T> list;

        public myGenericIteratorClass(myGenericList<T> list) {
            this.list = list;
        }
        int index = 0;
        @Override
        public boolean hasNext() {
            System.out.println("Called hasNext");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("Called Next");
            return list.arr[index++];
        }
    }

}
