package Divide_and_Conquer.Zero_One_Knapsack;

public class Main {
    public static void main(String[] args) {

        ZeroOneKnapsack zok  = new ZeroOneKnapsack();

        int[] profits = {31,26,17,72};
        int[] weights = {3,1,2,5};
        int maxProfit = zok.findMaxProfit(profits, weights, 7);
        System.out.println(maxProfit);
    }
}
