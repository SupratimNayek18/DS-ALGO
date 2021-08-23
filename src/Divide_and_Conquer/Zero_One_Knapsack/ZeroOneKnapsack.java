package Divide_and_Conquer.Zero_One_Knapsack;

public class ZeroOneKnapsack {
    
    private int findMaxProfit(int[] profits,int[] weights,int capacity,int currentIndex){

        if(capacity<=0 || currentIndex >= profits.length || currentIndex < 0){
            return 0;
        }
        int profit1 = 0;
        if(weights[currentIndex]<capacity){
            profit1 = profits[currentIndex] + findMaxProfit(profits,weights,capacity-weights[currentIndex],currentIndex+1);
        }
        int profit2 = findMaxProfit(profits,weights,capacity,currentIndex+1);
        return Math.max(profit1,profit2);

    }

    int findMaxProfit(int[] profits,int[] weights,int capacity){
        return findMaxProfit(profits,weights,capacity,0);
    }
}
