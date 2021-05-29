package Double_Linked_List;

public class DoubleLL {
    Node head;
    Node tail;
    int size;

    void createDoubleLL(int nodevalue){
        Node node = new Node();
        node.value = nodevalue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }
    void insertDoubleLL(int nodevalue,int position){
        Node node = new Node();
        node.value = nodevalue;
        if(size==0)createDoubleLL(nodevalue);
        else if(position==1){
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        else if(position>=size){
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempNode = head;
            for(int i=0;i<position-1;i++){
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
}
