package Stack_Using_Array;

class Stack {
    int[] arr;    
    int topOfStack;

    Stack(int size){
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created wiht size : "+size);
    }

    boolean isEmpty(){
        if(topOfStack==-1) return true;
        return false;
    }

    boolean isFull(){
        if(topOfStack==arr.length-1) return true;
        return false;
    }

    void push(int value){
        try{
            if(isFull()){
                System.out.println("Stack is Full");
            }else{
                topOfStack++;
                arr[topOfStack] = value;
                System.out.println("Value inserted succesfully");
            }
        }catch(Exception e){
            if(arr==null){
                System.out.println("Stack Does Not Exist");
            }else{
                System.out.println(e);
            }
        }
    }

    void pop(){
        try{
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }else{
                arr[topOfStack] = Integer.MIN_VALUE;
                topOfStack--;
                System.out.println("Value popped succesfully");
            }
        }catch(Exception e){
            if(arr==null){
                System.out.println("Stack Does Not Exist");
            }else{
                System.out.println(e);
            }
        }
        
    }

    void peek(){
        try{
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }else{
                System.out.println(arr[topOfStack]);
            }
        }catch(Exception e){
            if(arr==null){
                System.out.println("Stack Does Not Exist");
            }else{
                System.out.println(e);
            }
        }
    }

    void delete(){
        arr = null;
        System.out.println("Stack deleted succesfully");
    }
}
