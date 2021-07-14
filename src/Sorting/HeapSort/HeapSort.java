package Sorting.HeapSort;

public class HeapSort {
    int[] arr = null;

    HeapSort(int[] arr){
        this.arr = arr;
    }

    void sort(){
        BinaryHeap bh = new BinaryHeap(arr.length);
        for(int i=0; i<arr.length; i++){
            bh.insertIntoHeap(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = bh.extractHeadOfHeap();
        }
    }

    void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
