package Array;

public class MissingArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,8,9,10};
        missingNumber(myArray);
    }
    static void missingNumber(int[] myArray) {
        int num = 0;
        for(int i = 0; i < myArray.length; i++){
            if(i+1!=myArray[i]){
                num = i+1;
                break;
            }
        }
        System.out.println(num);
    }
}

