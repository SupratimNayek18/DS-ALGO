package Dynamic_Programming.Number_Factor;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(waysToGetN(5,memo));
        System.out.println(waysToGetNTab(5));
    }

    //top down memoization
    static int waysToGetN(int n,HashMap<Integer, Integer> memo) {
        
        if(n==0||n==1||n==2) return 1;
        if(n==3) return 2;
        if(!memo.containsKey(n)){
            memo.put(n,waysToGetN(n-1,memo)+waysToGetN(n-3,memo)+waysToGetN(n-4,memo));
        }
        return memo.get(n);
    }


    //bottom up tabulation
    static int waysToGetNTab(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        for(int i=4;i<=n;i++){
            arr.add(arr.get(i-1)+arr.get(i-3)+arr.get(i-4));
        }
        return arr.get(n);
    }
}
