package Double_Linked_List;

public class Main {
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.createDoubleLL(5);
        // System.out.println(dll.head.value);
        dll.insertDoubleLL(6,2);
        dll.insertDoubleLL(7,3);
        dll.insertDoubleLL(2,4);
        dll.insertDoubleLL(8,5);
        dll.insertDoubleLL(9,6);
        // System.out.println(dll.head.value);
        // System.out.println(dll.tail.value);
        // dll.revTraverseDoubleLL();
        dll.deleteDoubleLL(3);
        dll.traverseDoubleLL();
    }
}
