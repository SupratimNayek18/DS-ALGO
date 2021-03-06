package Double_Linked_List;

public class DoubleLL {
    Node head;
    Node tail;
    int size;

    void createDoubleLL(int nodevalue) {
        Node node = new Node();
        node.value = nodevalue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    void insertDoubleLL(int nodevalue, int position) {

        Node node = new Node();
        node.value = nodevalue;
        if (head==null)
            createDoubleLL(nodevalue);
        else if (position == 1) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        } else if (position > size) {
            node.next = null;
            node.prev = tail;
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

    void traverseDoubleLL(){
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

    void revTraverseDoubleLL(){
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

    void deleteDoubleLL(int position){
        Node tempNode = head;
        Node nextNode = head;
        if(position==0)System.out.println("Please Enter a valid position");
        else{
            if(position==1){
                tempNode = tempNode.next;
                tempNode.prev = null;
                head.next = null;
                head = tempNode;
            }
            else if(position>=size){
                for(int i = 0;i<size-1;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
                tail.prev = null;
                tail = tempNode;
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
