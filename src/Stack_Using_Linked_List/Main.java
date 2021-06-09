package Stack_Using_Linked_List;

public class Main {
    public static void main(String[] args) {
        StackLL newStack = new StackLL();
        // System.out.println(newStack.isEmpty());

        newStack.push(6);
        newStack.push(7);
        newStack.push(8);
        newStack.peek();
        newStack.pop();
        newStack.peek();
        newStack.delete();
        newStack.pop();
        newStack.peek();
    }
}
