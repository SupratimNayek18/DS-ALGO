package Sorting.MergeSort;
public class MergeSort {

  void merge(int[] A, int left, int middle, int right) {    
    
    int i = left,j = middle+1,k = left;
    int[] tempArray = new int[A.length];
    while(i<=middle && j<=right){
      if(A[i]<A[j]){
        tempArray[k] = A[i];
        i++;
      }else{
        tempArray[k] = A[j];
        j++;
      }
      k++;
    }
    if(i>middle){
      while(j<=right){
        tempArray[k] = A[j];
        k++;
        j++;
      }
    }else{
      while(i<=middle){
        tempArray[k] = A[i];
        k++;
        i++;
      }
    }
    for(k = left; k <= right; k++){
      A[k] = tempArray[k];
    }
  }

  void mergeSort(int[] Array, int left, int right) {
    if (right > left) {
      int m = (left+right)/2;
      mergeSort(Array, left, m);
      mergeSort(Array, m+1, right);
      merge(Array, left, m, right);
    }
  }

	void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
