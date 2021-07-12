package Sorting.BucketSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {6,3,9,4,1,2,12,5};
        BucketSort bs = new BucketSort(array);
        bs.display();
        bs.bucketSort();
        bs.display();
    }
}
