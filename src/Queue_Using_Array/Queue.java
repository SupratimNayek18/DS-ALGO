package Queue_Using_Array;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    Queue(int size){
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue is created");
    }

    Boolean isFull(){
        if(topOfQueue==arr.length-1){
            return true;
        }else return false;
    }

    boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }else return false;
    }

    void enQueue(int value){
        try{
            if(isEmpty()){
                topOfQueue++;
                arr[topOfQueue] = value;
                beginningOfQueue = topOfQueue;
                System.out.println("Value inserted succesfully");
            }else{
                topOfQueue++;
                arr[topOfQueue] = value;
            }
        }catch(Exception e){
            if(arr == null){
                System.out.println("Queue doesnt exist");
            }else{
                System.out.println(e.getMessage());
            }
        }
    }

    void deQueue(){
        try{
            if(arr!=null){
                beginningOfQueue++;
                System.out.println("Value deleted succesfully");
            }else{
                System.out.println("Queue doesnt exist");
            }
        }catch(Exception e){
            if(arr == null){
                System.out.println("Queue doesnt exist");
            }else{
                System.out.println(e);
            }
        }
    }

    void peek(){
        try{
            System.out.println(arr[beginningOfQueue]);
        }catch(Exception e){
            if(arr == null){
                System.out.println("Queue doesnt exist");
            }else{
                System.out.println(e);
            }
        }
    }

    void delete(){
        arr = null;
    }
}
