package Divide_and_Conquer.Number_Factor;

public class NumberFactor {
    
    static int waysToGetN(int n){
        
        if(n==0||n==1||n==2) return 1;
        if(n==3) return 2;

        int case1 = waysToGetN(n-1);
        int case2 = waysToGetN(n-3);
        int case3 = waysToGetN(n-4);

        return case1 + case2 + case3;
    }
}
