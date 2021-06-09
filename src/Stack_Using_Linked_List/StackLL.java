package Stack_Using_Linked_List;

public class StackLL {
    Node topOfStack;
    StackLL(){
        System.out.println("Stack is created");
    }

    boolean isEmpty(){
        if(topOfStack==null){
            return true;
        }
        return false;
    }

    void push(int nodeValue){
        try{
            Node node = new Node();
            node.value = nodeValue;
            node.next = topOfStack;
            topOfStack = node;
            System.out.println("Value inserted succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void pop(){
        try{
            topOfStack = topOfStack.next;
        }catch(Exception e){
            if(isEmpty()) System.out.println("Stack doesnt exist");
            else System.out.println(e);
        }
    }

    void peek(){
        try{
            System.out.println(topOfStack.value);
        }catch(Exception e){
            if(isEmpty()) System.out.println("Stack doesnt exist");
            else System.out.println(e);
        }
        
    }

    void delete(){
        topOfStack = null;
    }
}
