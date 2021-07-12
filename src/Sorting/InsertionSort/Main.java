package Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[] = {4,1,3,2,5};
        is.insertionSort(arr);
        is.display(arr);
    }   
}
