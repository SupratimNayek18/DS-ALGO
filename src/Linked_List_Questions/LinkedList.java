package Linked_List_Questions;

 class LinkedList {
     Node head;
     Node tail;
     int size;

     void createLinkedList(int nodevalue){
        Node node = new Node();
        node.value = nodevalue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

     void insertLinkedList(int nodevalue){
        Node node = new Node();
        node.value = nodevalue;
        if(head == null){
            createLinkedList(nodevalue);
        }else{
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
        
    }

     void traverseLinkedList(){
        Node tempNode = head;
        for(int i = 0; i < size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    void removeDups(){
        
    }
}
