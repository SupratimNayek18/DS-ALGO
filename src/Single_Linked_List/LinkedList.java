package Single_Linked_List;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public void createLinkedList(int nodeValue) {
        // head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        // return head;
    }
    public void insertInLinkedList(int nodeValue,int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            node.next = head;
            head = node;
        }
        else if(location>=size){
            node.next = null;
            tail.next = node;
            tail=node;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    public void traverseLinkedList(){
        Node tempNode = head;
        // System.out.println(size);
        for(int i = 0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if(i!=size-1){
                System.out.print("->");
            }
        }
        System.out.println("\n");
    }
    public void searchLinkedList(int nodeValue){
        Node tempNode = head;
        for(int i = 0;i<size;i++){
            if(tempNode.value==nodeValue){
                System.out.println("Value found at position : "+(i+1));
            }
            tempNode = tempNode.next;
        }
    }
    public void deleteLinkedList(int position){
        Node tempNode = head;
        Node nextNode = head;
        if(position==0)System.out.println("Please Enter a valid position");
        else{
            if(position==1){
                tempNode = tempNode.next;
                head.next = null;
                head = tempNode;
            }
            else if(position>=size){
                for(int i = 0;i<size-1;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
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
        }
        size--;
    }
}
