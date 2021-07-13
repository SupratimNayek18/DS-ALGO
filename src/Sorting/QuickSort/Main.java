package Sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {4, 8, 2, 9, 1, 3, 6, 5, 7};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length-1);
        qs.printArray(arr);

    }
}
