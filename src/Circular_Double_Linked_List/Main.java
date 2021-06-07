package Circular_Double_Linked_List;

public class Main {
    public static void main(String[] args) {
        CircularDoubleLL cdll  = new CircularDoubleLL();
        cdll.createCircularDoubleLL(5);
        // System.out.println(cdll.head.value);
        cdll.insertCircularDoubleLL(6,1);
        cdll.insertCircularDoubleLL(7,10);
        cdll.insertCircularDoubleLL(8,10);
        // System.out.println(cdll.head.value);
        // System.out.println(cdll.tail.value);
        // System.out.println(cdll.head.prev.value);
        cdll.traverseCircularDoubleLL();
        // cdll.deleteCircularDoubleLL(1);
        cdll.insertCircularDoubleLL(9,1);
        cdll.traverseCircularDoubleLL();
        System.out.println(cdll.head.value);
        System.out.println(cdll.tail.value);
        System.out.println(cdll.head.prev.value);
        System.out.println(cdll.tail.next.value);
    }
}
