package Binary_Search_Tree;
import java.util.*;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree(){
        root = null;
        System.out.println("Binary Search Tree has been created");
    }

    //inserting elements into binary search tree
    private BinaryNode insert(BinaryNode currentNode,int value){
        if(currentNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("Value successfully inserted");
            return newNode;
        }
        else if(currentNode.value>=value){
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }
        else {
            currentNode.right = insert(currentNode.right,value);
            return currentNode;
        }
    }

    void insert(int value){
        root = insert(root,value);
    }

    void preOrderTraversal(BinaryNode node) {
        if(node==null) return;
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(BinaryNode node) {
        if(node==null) return;
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }

    void postOrderTraversal(BinaryNode node) {
        if(node==null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    // String search(int value){
    //     Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    //     queue.add(root);
    //     int flag = 0;
    //     while(!queue.isEmpty()){
    //         BinaryNode presentNode = queue.remove();
    //         if(presentNode.value==value){
    //             flag = 1;
    //         }else{
    //             if(presentNode.left!=null){
    //                 queue.add(presentNode.left);
    //             }
    //             if(presentNode.right!=null){
    //                 queue.add(presentNode.right);
    //             }
    //         }
    //     }
    //     return flag==1? "Value found" : "Value not found";
    // }

    void search(BinaryNode root,int value){
        if(root==null){
            System.out.println("Value does not exist");
        }else if(value>root.value){
            search(root.right,value);
        }else if(value<root.value){
            search(root.left,value);
        }else if(root.value==value) System.out.println("Value found");
    }

    BinaryNode minimumNode(BinaryNode root){
        if(root.left==null){
            return root;
        }else{
            return minimumNode(root.left);
        }
    }

    public BinaryNode deleteNode(BinaryNode root,int value){
        if(root==null){
            System.out.println("value doesnt exist");
            return null;
        }else if(value<root.value){
            root.left = deleteNode(root.left,value);
        }else if(value>root.value){
            root.right = deleteNode(root.right,value);
        }else{
            if(root.left!=null&&root.right!=null){
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right,minNodeForRight.value);
            }else if(root.right!=null){
                root = root.right;
            }else if(root.left!=null){
                root = root.left;
            }else{
                root = null;
            }
        }
        return root;
    }

    void deleteBST(){
        root = null;
        System.out.println("BST has been deleted succesfully");
    }
}
