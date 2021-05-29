package Double_Linked_List;

public class Main {
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.createDoubleLL(5);
        // System.out.println(dll.head.value);
        dll.insertDoubleLL(6,1);
        dll.insertDoubleLL(7,2);
        System.out.println(dll.head.value);
        System.out.println(dll.tail.value);

    }
}
