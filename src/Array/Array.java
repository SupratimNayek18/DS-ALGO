package Array;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array obj = new Array(); 
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int array[] = new int[n];
        boolean val = true;
        while(val == true){
            System.out.println("\nEnter your choice : \n1.Enter value\n2.Delete Value\n3.Display Value\n4.Search Value\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.enterValue(array);
                    break;
                case 2:
                    obj.deleteValue(array);
                    break;
                case 3:
                    obj.displayValue(array);
                    break;
                case 4:
                    obj.searchValue(array);
                    break;
                case 5:
                    System.out.print("Exiting Program");
                    val=false;
                default:
                    break;
            }
        }
        
    }
    void enterValue(int[] array) {
        Scanner sc = new Scanner(System.in);
         for(int i = 0; i < array.length; i++){
             System.out.println("Enter " + i +"th value : ");
             array[i] = sc.nextInt();
         }
         
    }
    void deleteValue(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to be deleted");
        int n = sc.nextInt();
        array[n] = Integer.MIN_VALUE;
    }
    void displayValue(int[] array) {
        if(array.length==0){
            System.out.println("Array doesnt have any value");
        }else{
            System.out.println("The array is : ");
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]+" ");
            }
        }
    }
    void searchValue(int[] array) {
        Scanner sc = new Scanner(System.in);
        if(array.length==0){
            System.out.println("Array doesnt have any value");
        }else{
        System.out.println("Enter the value to be searched");
        int n = sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i]==n){
                System.out.println("Value found at index "+i);
            }
        }
        }
    }
}
