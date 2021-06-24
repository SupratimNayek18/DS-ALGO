package AVL_Tree;
import java.util.*;

public class AVL {
    BinaryNode root;

    AVL(){
        root = null;
        System.out.println("AVL tree has been created");
    }

    //get height

    int getHeight(BinaryNode node) {
        if(node==null) return 0;
        return node.height;
    }

    //rotate right

    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //rotate left

    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //get balance

    int getBalance(BinaryNode node) {
        if(node==null) return 0;
        return getHeight(node.left)-getHeight(node.right);
    }

    //insert method

     private BinaryNode insertNode(BinaryNode node,int nodeValue){
         if(node==null){
             BinaryNode newNode = new BinaryNode();
             newNode.value = nodeValue;
             newNode.height = 1;
             return newNode;
         }
         else if(nodeValue>node.value){
            node.right = insertNode(node.right,nodeValue);
         }else if(nodeValue<node.value){
             node.left = insertNode(node.left,nodeValue);
         }

         node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
         int balance = getBalance(node);

         if(balance > 1 && nodeValue<node.left.value) return rotateRight(node);
         
         if(balance > 1 && nodeValue>node.left.value) {
             node.left = rotateLeft(node.left);
             return rotateRight(node);
         }

         if(balance < -1 && nodeValue>node.right.value) return rotateLeft(node);

         if(balance < -1 && nodeValue<node.right.value){
             node.right = rotateRight(node.right);
             return rotateLeft(node);
         }
         return node;
     }

     void insert(int value){
         root = insertNode(root,value);
     }

    //traversal techniques

    void preOrderTraversal(BinaryNode node) {
        if(node==null) return;
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(BinaryNode node){
        if(node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }

    void postOrderTraversal(BinaryNode node){
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }
    
    void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    //search

    void search(BinaryNode root,int value){
        if(root==null) return;
        if(value>root.value) search(root.right,value);
        else if(value<root.value) search(root.left,value);
        else if(value==root.value) System.out.println("Value Found!");
        else System.out.println("Value not Found!");
    }
}
