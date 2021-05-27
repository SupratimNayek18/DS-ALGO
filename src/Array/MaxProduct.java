package Array;

public class MaxProduct {
    public static void main(String[] args) {
        int[] myArray = {40,20,10,30,60,50};
        System.out.println(maxProduct(myArray));
    }

    static String maxProduct(int[] myArray) {
        int maxProduct = 0;
        String pairs = "";
        for(int i = 0; i < myArray.length-1;i++){
            for(int j = i+1; j < myArray.length;j++){
               if(myArray[i]*myArray[j]>maxProduct){
                    maxProduct = myArray[i]*myArray[j];
                    pairs = "("+myArray[i]+","+myArray[j]+")";
                }
            }
        }
        return pairs;
    }
}
