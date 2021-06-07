package Circular_Double_Linked_List;

public class CircularDoubleLL {
    Node head;
    Node tail;
    int size;

    void createCircularDoubleLL(int nodevalue) {
        Node node = new Node();
        node.value = nodevalue;
        node.prev = node;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }

    void insertCircularDoubleLL(int nodevalue, int position) {

        Node node = new Node();
        node.value = nodevalue;
        if (head==null)
            createCircularDoubleLL(nodevalue);
        else if (position == 1) {
            node.prev = tail;
            node.next = head;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (position > size) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            for (int i = 0; i < position - 2; i++) {
                tempNode = tempNode.next;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
            nextNode.prev = node;
            node.prev = tempNode;
            tempNode.next = node;
        }
        size++;
    }

    void traverseCircularDoubleLL(){
        Node tempNode = head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if(i!=size-1){
                System.out.print("<=>");
            }
        }
        System.out.println();
    }

    void revTraverseCircularDoubleLL(){
        Node tempNode = tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.prev;
            if(i!=size-1){
                System.out.print("<=>");
            }
        }
        System.out.println();
    }

    void deleteCircularDoubleLL(int position){
        Node tempNode = head;
        Node nextNode = head;
        if(position==0)System.out.println("Please Enter a valid position");
        else{
            if(position==1){
                tail.next = head.next;
                head = head.next;
                head.prev = tail;
            }
            else if(position>=size){
                for(int i = 0;i<size-1;i++){
                    tempNode = tempNode.next;
                }
                head.prev=tail.prev;
                tail = tail.prev;
                tail.next = head;
            }
            else{
                for(int i = 0;i<position;i++){
                    nextNode = nextNode.next;
                }
                for(int i = 0;i<position-2;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = nextNode;
                nextNode.prev = tempNode; 
            }
        }
        size--;
    }
}
