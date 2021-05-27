package Array;

import java.util.*;
public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int n = sc.nextInt();
        System.out.println(searchInArray(myArray,n));
        sc.close();
    }
    static int searchInArray(int[] intArray, int valueToSearch) {
        int index=0;
        for(int i = 0; i < intArray.length;i++) {
            if(valueToSearch==intArray[i])
            index=i;
        }
        return index;
    }
}
