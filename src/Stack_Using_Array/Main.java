package Stack_Using_Array;

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(2);
        s.push(3);
        s.push(4);
        s.peek();
        s.pop();
        s.peek();
        s.delete();
        s.pop();
    }
}
