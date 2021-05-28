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
        node.value = nodevalue;
        if(head==null){
            createCircularLL(nodevalue);
            return;
        }
        else if(position==1){
            node.next = head;
            head = node;
            tail.next = head;             
        }
        else if(position>=size){
            node.next = head;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index<position-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}
