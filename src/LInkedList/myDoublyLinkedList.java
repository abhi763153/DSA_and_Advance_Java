package LInkedList;

public class myDoublyLinkedList {

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    int size = 0;

    private void add(int val){


        Node node = new Node(val);

        if(head == null){
            head = node;
            this.size++;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        this.size++;

    }

    private int remove(int idx){

        if(idx <0 || idx >= this.size)return -1;

        if(head == null)return -1;

        if(idx == 0){
            int data = head.data;
            head = head.next;
            this.size--;
            return data;
        }

        int i = 0;
        Node temp = head;

        while(i != idx){
            temp = temp.next;
            i++;
        }

        int data = temp.data;

        temp.prev.next = temp.next;

        if(idx != this.size-1){
            temp.next.prev = temp.prev;
        }

        this.size--;
        return data;

    }

    private void print(){
        if(head == null)return;

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }


    public static void main(String[] args) {

        myDoublyLinkedList dll = new myDoublyLinkedList();

        dll.add(32);
        dll.add(12);
        dll.add(45);
        dll.print();
        System.out.println();
        dll.remove(1);
        dll.remove(dll.size-1);
        dll.remove(0);
        dll.print();
    }
}
