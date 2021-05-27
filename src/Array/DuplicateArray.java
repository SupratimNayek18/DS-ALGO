package Array;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        System.out.println(isUnique(myArray));
    }
    static boolean isUnique(int[] intArray) {
        for(int i = 0; i < intArray.length;i++) {
            for(int j=i+1;j< intArray.length;j++) {
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
