package BinartSearchTree;

public class BinartSearchTreeImple {

    private Node root;

    public void insert(int data){
        Node newNode = new Node(data);

        if(this.root == null){
            root = newNode;
        }

        Node current = root;

        while (true){
            Node parent = current;
            if(data > current.getData()){
                current = current.right;
                if(current == null){
                    parent.right = newNode;
                    break;
                }
            }else{
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    break;
                }
            }

        }

    }
}
