package Array;

public class PermutationArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        int[] intArray2 = {4,3,2,2,5};
        System.out.println(permutation(intArray, intArray2));
    } 
    static boolean permutation(int[] array1, int[] array2){
        int sum1=0;
        int sum2=0;
        int mul1 = 1;
        int mul2 = 1;
        if(array1.length!=array2.length) return false;
        for(int i=0; i<array1.length; i++){
            sum1+=array1[i];
            mul1*=array1[i];
        }
        for(int j=0; j<array2.length; j++){
            sum2+=array2[j];
            mul2*=array2[j];
        }
        if(sum1==sum2&&mul1==mul2) return true;
        else return false;
    }

}
