package Divide_and_Conquer.House_Robbery;

public class HouseRobbery {
    
    static private int maxMoneyRecursive(int[] HouseNetWorth,int currentIndex){
        
        if(currentIndex>=HouseNetWorth.length) return 0;

        int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth,currentIndex+2);
        int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth,currentIndex+1);

        return Math.max(stealCurrentHouse,skipCurrentHouse);

    }

    static int maxMoney(int[] HouseNetWorth){
        return maxMoneyRecursive(HouseNetWorth,0);
    }
}
