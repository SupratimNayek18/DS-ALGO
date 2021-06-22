package Binary_Tree_Using_Array;

public class BinaryTree {
    String[] arr;
    int lastIndexUsed;
    BinaryTree(int size){
        arr = new String[size];
        lastIndexUsed = 0;
        System.out.println("Tree of size "+size+" has been created");
    }

    boolean isFull(){
        if(arr.length-1 == lastIndexUsed){
            return true;
        }
        return false; 
    }

    void insert(String value){
        if(!isFull()){
            arr[lastIndexUsed+1] = value;
            lastIndexUsed++;
            System.out.println("Value "+value+" inserted successfully");
        }else{
            System.out.println("Array is full");
        }
    }

    void preOrderTraversal(int index){
        if(index>lastIndexUsed){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrderTraversal(2*index);
        preOrderTraversal(2*index+1);
        
    }

    void inOrderTraversal(int index){
        if(index>lastIndexUsed){
            return;
        }
        inOrderTraversal(2*index);
        System.out.print(arr[index]+" ");
        inOrderTraversal(2*index+1);
        
    }
    void postOrderTraversal(int index){
        if(index>lastIndexUsed){
            return;
        }
        postOrderTraversal(2*index);
        postOrderTraversal(2*index+1);
        System.out.print(arr[index]+" ");
        
    }

    void levelOrderTraversal(){
        for(int i=1; i<=lastIndexUsed;i++){
            System.out.print(arr[i]+" ");
        }
    }

    String search(String value){
        int flag = 0;
        for(int i=1; i<=lastIndexUsed;i++){
            if(arr[i]==value) flag=1;
        }
        return flag==1?"Value found":"Value not found";
    }

    void deleteNode(String value) {
        for(int i=0; i<=lastIndexUsed; i++){
            if(value==arr[i]){
                System.out.println("Value "+arr[i]+" deleted succesfully");
                arr[i] = arr[lastIndexUsed];
                lastIndexUsed--;
            }
        }
    }

    void deleteTree(){
        arr = null;
        System.out.println("Tree deleted succesfully");
    }








}
