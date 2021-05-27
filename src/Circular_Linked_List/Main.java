package Circular_Linked_List;

public class Main {
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.createCircularLL(5);
        System.out.println(cll.head.value);
        System.out.println(cll.head.next.value);
    }
}
