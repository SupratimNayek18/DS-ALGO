package Searching.BinarySearch;

public class BinarySearch {
    
    void search(int[] arr,int value) {
        int low = 0;
        int high = arr.length-1;
        int foundIndex = binarySearch(arr,low,high,value);
        if(foundIndex!=-1) System.out.println("Value found at index : "+foundIndex);
        else System.out.println("Value not found");
    }

    int binarySearch(int[] arr,int low,int high,int value){
        int foundIndex = 0;
        int mid = (low+high)/2;
        if(value==arr[low]) return low;
        else if(value==arr[high]) return high;
        else if(value==arr[mid]) return mid;
        else{
            if(value>arr[mid]){
                foundIndex = binarySearch(arr,mid+1,high,value);
            } 
            else {
                foundIndex = binarySearch(arr,low,mid-1,value);
            }
        }
        return foundIndex;
    }
}
