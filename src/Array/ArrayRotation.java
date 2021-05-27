package Array;

import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        int[][] intArray = {{1,2,3},{4,5,6},{7,8,9}}; 
        System.out.println(rotateMaxtrix(intArray));
    }

    static String rotateMaxtrix(int[][] intArray){
        int[][] newArray = {{0,0,0},{0,0,0},{0,0,0}};

        for(int i = 0; i < 3;i++){
            for(int j = 2; j >=0 ;j--){
                newArray[i][j] = intArray[j][i];
            }
        }

        return Arrays.toString(newArray);
    }
}
