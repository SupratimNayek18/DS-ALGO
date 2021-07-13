package Sorting.QuickSort;

public class QuickSort {

    //swap function for swap operations
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //partitions based on pivot element
    int partition(int[] arr,int start,int end){
        
        int i = start,j = end;
        int pivot = start;

        while(i<j){
            while(i<end && arr[i]<=arr[pivot]) i++;
            while(arr[j]>arr[pivot]) j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,pivot);
        return j;
    }

    //function to implement quicksort algorithm
    void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
