package Circular_Linked_List;

class CircularLL {
    Node head;
    Node tail;
    int size;
    
    void createCircularLL(int nodevalue){
        Node node = new Node();
        node.value = nodevalue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }
    void insertCircularLL(int nodevalue,int position){
        Node node = new Node();
        if(head==null){
            createCircularLL(nodevalue);
        }
        else if(position==1){
            node.value = nodevalue;
            node.next = head;
            head = node;
            
        }
    }
}
