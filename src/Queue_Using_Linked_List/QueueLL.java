package Queue_Using_Linked_List;

public class QueueLL {
    Node beginningOfQueue;
    Node topOfQueue;

    QueueLL(){
        beginningOfQueue = null;
        topOfQueue = null;
        System.out.println("Queue has been created");
    }

    boolean isEmpty(){
        if(beginningOfQueue==null) return true;
        else return false;
    }

    void enQueue(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        if(isEmpty()){
            beginningOfQueue = node;
            topOfQueue = node;
        }else{
            topOfQueue.next = node;
            topOfQueue = node;            
        }
        System.out.println("Value "+node.value+" has been added to queue");
    }

    void deQueue(){
        beginningOfQueue = beginningOfQueue.next;
        System.out.println("Value deleted from queue successfully");
    }

    void peek(){
        System.out.println(beginningOfQueue.value);
    }

    void delete(){
        beginningOfQueue = null;
        System.out.println("Queue has been deleted");
    }
}
