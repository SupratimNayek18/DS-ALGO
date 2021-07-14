package Sorting.HeapSort;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;
    BinaryHeap(int size){
        arr = new int[size+1];
        sizeOfTree = 0;
    }

    Boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }else return false;
    }

    void heapifyBottomToTop(int index){
        int parent = index/2;
        if(index<=1){
            return;
        }
        if(arr[index]<arr[parent]){
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;
        }
        heapifyBottomToTop(parent);
    }

    void insertIntoHeap(int value){
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree);  
    }

    void heapifyTopToBottom(int index){
        int leftChild = index*2;
        int rightChild = index*2+1;
        int swapChild=0;
        if(sizeOfTree<leftChild){
            return;
        }
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
        heapifyTopToBottom(swapChild);
    }

    int extractHeadOfHeap(){
        if(isEmpty()) return -1;
        else{
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            return extractedValue;
        }
    }

}
