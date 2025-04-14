package BinartSearchTree;

public class BinartSearchTreeImple {

    private Node root;

    public void insert(int data){
        Node newNode = new Node(data);

        if(this.root == null){
            root = newNode;
            return;
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

    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.getData()+" ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
    }

    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.getData()+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}
