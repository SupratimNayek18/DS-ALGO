package Circular_Linked_List;

public class Main {
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.createCircularLL(5);
        // System.out.println(cll.head.value);
        // System.out.println(cll.head.next.value);
        cll.insertCircularLL(6,2);
        cll.insertCircularLL(7,3);
        cll.insertCircularLL(8,4);   
        // System.out.println(cll.head.value);
        // System.out.println(cll.tail.value);
        cll.traverseCircularLL();
        cll.searchCircularLL(7);
        cll.deleteCircularLL(3);
        cll.traverseCircularLL();
    }
}
