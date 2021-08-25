package Divide_and_Conquer.Fibonnaci_Series;

public class Fibonacci {
    
    int findFibonacciNumber(int index){

        if(index==0) return 0;
        
        if(index==1 || index==2) return 1;

        return findFibonacciNumber(index-1)+findFibonacciNumber(index-2);
        
    }

}
