package Circular_Queue_Using_Array;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    Queue(int size){
        arr = new int[size];
        this.size = size;
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Queue has been created");
    }

    boolean isEmpty() {
        if(beginningOfQueue==-1) return true;
        return false;
    }

    boolean isFull(){
        if(topOfQueue+1==beginningOfQueue) return true;
        else if(beginningOfQueue==0&&topOfQueue+1==size) return true;
        else return false;
    }

    void enQueue(int value){
        try{
            if(isFull()) System.out.println("Queue is full");
            else{
                if(isEmpty()){
                    topOfQueue++;
                    arr[topOfQueue] = value;
                    beginningOfQueue = topOfQueue;
                    System.out.println("Value inserted successfully");
                }else{
                    if(topOfQueue+1==size) topOfQueue = 0;
                    else{
                        topOfQueue++;
                    }
                    arr[topOfQueue] = value;
                    System.out.println("Value inserted successfully");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
    
    public int deQueue() {
        if (isEmpty()) {
          System.out.println("The CQ is empty!");
          return -1;
        } else {
          int result = arr[beginningOfQueue];
          arr[beginningOfQueue] = 0;
          if (beginningOfQueue == topOfQueue) {
            beginningOfQueue = topOfQueue = -1;
          } else if (beginningOfQueue+1 == size) {
            beginningOfQueue = 0;
          } else {
            beginningOfQueue++;
          }
          return result;
        }
      }
    
      // peek
      public int peek() {
        if (isEmpty()) {
          System.out.println("The CQ is emtpy");
          return -1;
        } else {
          return arr[beginningOfQueue];
        }
      }
    
      // deleteQueue
      public void deleteQueue() {
        arr = null;
        System.out.println("The CQ is successfully deleted!");
      }
}
