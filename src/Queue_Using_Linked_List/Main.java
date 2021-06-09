package Queue_Using_Linked_List;

public class Main {
    public static void main(String[] args) {
        QueueLL qll = new QueueLL();
        qll.enQueue(5);
        qll.enQueue(6);
        qll.enQueue(7);
        qll.peek();
        qll.deQueue();
        qll.peek();
        qll.delete();
    }
}
