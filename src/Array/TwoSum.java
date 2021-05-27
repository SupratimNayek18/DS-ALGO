package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,5,7,2};
        int target  = 9;
        twoSum(nums,target);
    }
    static void twoSum(int[] nums,int target) {
        a:{
            for(int i = 0; i < nums.length; i++){
                for(int j=0;j<nums.length;j++){
                    if(target ==(nums[i]+nums[j])){
                        System.out.println("["+i+","+j+"]");
                        break a;
                    }
                }
            }
        }
        
    }
}
