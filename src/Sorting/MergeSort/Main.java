package Sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {34,12,67,52,41,25,13,55,21};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        ms.printArray(arr);
    }
}
