package Binary_Heap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;
    BinaryHeap(int size){
        arr = new int[size+1];
        sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    Boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }else return false;
    }

    Integer peek(){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return null;
        }else{
            return arr[1];
        }
    }
}
