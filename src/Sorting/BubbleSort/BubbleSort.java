package Sorting.BubbleSort;
import java.util.*;

public class BubbleSort {
    int[] arr;

    //constructor
    BubbleSort(int size) {
        arr = new int[size];
    }

    //creating a function to take input in arr from scanner
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    //creating a bubblesort function
    public void bubblesort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //creating a display function for the array
    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
