package Sorting.SelectionSort;
import java.util.*;

class SelectionSort { 
    int[] arr;

    SelectionSort(int size){
        arr = new int[size];
    }

    //creating a function to take input from the user into array
    void takeInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter element for array: "+i);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    void selectionSort(){
          for(int i=0;i<arr.length;i++){
            int min = i;
              for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
