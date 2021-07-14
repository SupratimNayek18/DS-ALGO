package Searching.LinearSearch;

public class LinearSearch {
    
    void search(int[] arr,int searchVal){
        int i = 0;
        for(int value:arr){
            if(value==searchVal){
                System.out.println("Value found at index : "+i);
                break;
            }
            i++;
        }
    }
}
