package Sorting.HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,7,8,10,9,5};
        HeapSort hs = new HeapSort(arr);
        hs.sort();
        hs.printArray(arr);
    }
}