package Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(10);
        bst.insert(5);
        bst.insert(70);
        bst.insert(40);
        bst.insert(60);
        bst.insert(100);
        bst.insert(24);
        bst.insert(45);
        bst.insert(67);
        bst.preOrderTraversal(bst.root);
        System.out.println();
        bst.inOrderTraversal(bst.root);
        System.out.println();   
        bst.postOrderTraversal(bst.root);
        System.out.println();
        bst.search(bst.root,28);
    }
}
