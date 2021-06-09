package Queue_Using_Array;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(5);

        newQueue.enQueue(5);
        newQueue.enQueue(6);
        newQueue.enQueue(7);
        newQueue.enQueue(7);
        newQueue.enQueue(7);
        newQueue.enQueue(7);
        newQueue.enQueue(7);
        // newQueue.peek();  // 5
        // newQueue.deQueue(); 
        // newQueue.peek();  //6
        // newQueue.delete();
        // newQueue.deQueue();  //doesnt exist
    }
}
