package Binary_Heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(8);
        bh.insert(10,"max");
        bh.insert(5,"max");
        bh.insert(15,"max");
        bh.insert(1,"max");
        bh.levelOrderTraversal();
        bh.extractHeadOfHeap("max");
        bh.levelOrderTraversal();
    }
}
