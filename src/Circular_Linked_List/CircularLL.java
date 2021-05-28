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

    void traverseCircularLL(){
        Node tempNode = head;
        // System.out.println(size);
        for(int i = 0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if(i!=size-1){
                System.out.print("->");
            }
            
        }
        System.out.print("->"+tempNode.value);
        System.out.println('\n');
    }

    void searchCircularLL(int nodevalue){
        Node tempNode = head;
        for(int i = 0;i<size;i++){
            if(tempNode.value==nodevalue){
                System.out.println("Value found at position : "+(i+1));
                break;
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }
    void deleteCircularLL(int position){
        Node tempNode = head;
        Node nextNode = head;
        if(position==0){
            System.out.println("Enter valid position");
        }
        else if(position>=size){
            for(int i = 0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = head;
            tail.next = null;
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
        }
        size--;
    }
}
