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

    int sizeOfHeap(){
        return sizeOfTree;
    }

    void levelOrderTraversal(){
        for(int i=1;i<=sizeOfTree;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void heapifyBottomToTop(int index,String heapType){
        int parent = index/2;
        if(index<=1){
            return;
        }
        if(heapType=="min"){
            if(arr[index]<arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }else if(heapType=="max"){
            if(arr[index]>arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent,heapType);
    }

    void insert(int value,String heapType){
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree,heapType);
        System.out.println(value+"successfully insert in heap");  
    }

    void heapifyTopToBottom(int index,String heapType){
        int leftChild = index*2;
        int rightChild = index*2+1;
        int swapChild=0;
        if(sizeOfTree<leftChild){
            return;
        }
        if(heapType=="max"){
            if(sizeOfTree==leftChild){
                if(arr[index]<arr[leftChild]){
                    int temp = arr[index];
                    arr[index] = arr[leftChild];
                    arr[leftChild] = temp;
                }
                return;
            }else{
                if(arr[leftChild]>arr[rightChild]){
                    swapChild = leftChild;
                }else{
                    swapChild = rightChild;
                }
                if(arr[index]<arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }else if(heapType=="min"){
            if(sizeOfTree==leftChild){
                if(arr[index]>arr[leftChild]){
                    int temp = arr[index];
                    arr[index] = arr[leftChild];
                    arr[leftChild] = temp;
                }
                return;
            }else{
                if(arr[leftChild]>arr[rightChild]){
                    swapChild = rightChild;
                }else{
                    swapChild = leftChild;
                }
                if(arr[index]>arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild,heapType);
    }

    int extractHeadOfHeap(String heapType){
        if(isEmpty()) return -1;
        else{
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1,heapType);
            return extractedValue;
        }
    }

    void deleteHeap(){
        arr = null;
        System.out.println("Heap deleted successfully");
    }

}
