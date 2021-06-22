package Binary_Tree_Linked_List;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        TreeNode n1 = new TreeNode();
        n1.value = "Drinks";
        TreeNode n2 = new TreeNode();
        n2.value = "Hot";
        TreeNode n3 = new TreeNode();
        n3.value = "Cold";
        TreeNode n4 = new TreeNode();
        n4.value = "Soda";
        TreeNode n5 = new TreeNode();
        n5.value = "Tea";
        TreeNode n6 = new TreeNode();
        n6.value = "Cofee";
        TreeNode n7 = new TreeNode();
        n7.value = "Beer";

        n1.left = n2;
        n1.right = n3;
        n2.left = n5;
        n2.right = n6;
        n3.left = n4;
        n3.right = n7;
        
        bt.root= n1;

        bt.preOrderTraversal(bt.root);
        System.out.println();
        bt.postOrderTraversal(bt.root);
        System.out.println();
        bt.inOrderTraversal(bt.root);
        System.out.println();
        System.out.println(bt.binaryTreeSearch("Beer"));
    }
}
