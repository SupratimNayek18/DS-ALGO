package Divide_and_Conquer.Minimum_Cost_To_Reach_Last_Cell;

public class MinimumCostToReachLastCell {
    
    int FindMinimumCostToReachLastCell(int[][] cost,int row,int col){
        
        if(row==-1||col==-1) return Integer.MAX_VALUE;

        if(row==0 && col==0) return cost[0][0];

        int minCost1 = FindMinimumCostToReachLastCell(cost,row,col-1);
        int minCost2 = FindMinimumCostToReachLastCell(cost,row-1,col);
        int minCost = Integer.min(minCost1,minCost2);

        return minCost + cost[row][col];
    }
}
