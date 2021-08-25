package Dynamic_Programming.Fibonacci_Series;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(fibMemo(6,memo));
        System.out.println(fibtab(6));
    }

    // top down memoization
    static int fibMemo(int n,HashMap<Integer,Integer> memo){
        
        if(n==1) return 0;
        if(n==2) return 1;

        if(!memo.containsKey(n)){
            memo.put(n,fibMemo(n-1, memo)+fibMemo(n-2,memo));
        }

        return memo.get(n);
    }

    //bottom up tabulation
    static int fibtab(int n){
        ArrayList<Integer> tb = new ArrayList<Integer>();
        tb.add(0);
        tb.add(1);
        for(int i=2;i<n;i++){
            int n1 = tb.get(i-1);
            int n2 = tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
        // for(int i=0;i<n;i++){
        //     System.out.print(tb.get(i)+" ");
        // }
    }
}
