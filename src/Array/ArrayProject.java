package Array;

import java.util.*;
public class ArrayProject {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter no of days temperature");
        int n = sc.nextInt();
        float sum = 0;
        int count = 0;
        int[] tempArr = new int[n];
        for(int i=0;i<tempArr.length;i++){
            tempArr[i] = sc.nextInt();
        }
        for(int j=0;j<tempArr.length;j++){
            sum+=tempArr[j];
        }
        System.out.println("Average temp : "+sum/tempArr.length);
        for(int i=0;i<tempArr.length;i++){
            if(tempArr[i]>sum/tempArr.length){
                count++;
            }
        }
        System.out.println(count+" no of temperatures are above average");
    }
}
