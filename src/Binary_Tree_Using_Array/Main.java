package Binary_Tree_Using_Array;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.insert("1");
        bt.insert("2");
        bt.insert("3");
        bt.insert("4");
        bt.insert("5");
        bt.insert("6");
        bt.insert("7");
        bt.insert("8");
        bt.insert("9");
        // bt.insert("10");
        // bt.insert("11");
        bt.preOrderTraversal(1);
        System.out.println();
        bt.inOrderTraversal(1);
        System.out.println();
        bt.postOrderTraversal(1);
        System.out.println();
        bt.levelOrderTraversal();
        System.out.println();
        bt.deleteNode("5");
        System.out.println();
        bt.levelOrderTraversal();
    }
}
