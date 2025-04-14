package BinartSearchTree;

public class MainBST {

    public static void main(String[] args) {

        BinartSearchTreeImple bst = new BinartSearchTreeImple();

        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(14);
        bst.insert(13);


        bst.inOrder();

    }
}
