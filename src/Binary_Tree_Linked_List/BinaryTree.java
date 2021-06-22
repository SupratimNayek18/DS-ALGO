package Binary_Tree_Linked_List;
import java.util.*;

public class BinaryTree {
    TreeNode root;
    BinaryTree(){
        root = null;
        System.out.println("Tree has been created");
    }

    void preOrderTraversal(TreeNode node) {
        if(node==null) return;
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(TreeNode node){
        if(node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }

    void postOrderTraversal(TreeNode node){
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    void levelOrderTraversal(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            System.out.println(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    String binaryTreeSearch(String value){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int flag = 0;
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.value==value){
                flag = 1;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        return flag==1? "Value found" : "Value not found";
    }

    void insertBinaryTree(String value){
        TreeNode newNode = new TreeNode();
        if(root==null){
            root = newNode;
            System.out.println("Value inserted succesfully in root");
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.left!=null){
                presentNode.left = newNode;
                System.out.println("Value inserted succesfully");
            }
            else if(presentNode.right!=null){
                presentNode.right = newNode;
                System.out.println("Value inserted succesfully");
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    TreeNode getDeepestNode(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode presentNode = queue.remove();
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    void deleteDeepestNode(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode previousNode,presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
            }
            else if(presentNode.right == null){
                presentNode.left = null;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    void deleteNode(String value){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.value==value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Value deleted succesfully");
            }else{
                if(presentNode.left!=null) queue.add(presentNode.left);
                if(presentNode.right!=null) queue.add(presentNode.right);
            }
        }
    }
}
