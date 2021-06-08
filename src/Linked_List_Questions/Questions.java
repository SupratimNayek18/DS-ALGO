package Linked_List_Questions;
import java.util.*;

public class Questions {
    
    // Q.1) Remove duplicates in a linked list

    void deleteDups(LinkedList ll){
        HashSet<Integer> hs = new HashSet();
        Node current = ll.head;
        Node prev = null;
        while(current != null){
            int curval = current.value;
            if(hs.contains(curval)){
                prev.next = current.next;
                ll.size--;
            }else{
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
   }

    // Q.2) Implement an algorithm to find Nth to last element in singly LL

    void noOfElements(LinkedList ll,int nodeValue){
        Node tempNode = ll.head;
        int count = 0;
        while(tempNode != null){
            if(tempNode.value == nodeValue){
                while(tempNode != null){
                    count++;
                    tempNode = tempNode.next;
                }
            }
            if(tempNode != null){
                tempNode = tempNode.next;
            }
        }
        System.out.println(count);
    }

    // Q.3) Partition all node with lesser value than given value
    
    void partition(LinkedList ll,int nodeValue){
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while(currentNode!=null){
            Node next = currentNode.next;
            if(currentNode.value>=nodeValue){
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }else {
                currentNode.next = ll.head;
                ll.head = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
    }

    // Q.4) SUM OF LINKED LIST IN REVERSE ORDER

    void sumOfList(LinkedList ll,LinkedList ll2){
        LinkedList ll3 = new LinkedList();
        int carry = 0;
        Node n1 = ll.head;
        Node n2 = ll2.head;
        while(n1 != null || n2 != null) {
            int result = carry;
            if(n1!= null){
                result += n1.value;
                n1 = n1.next;
            }
            if(n2 != null){
                result += n2.value;
                n2 = n2.next;
            }
            ll3.insertLinkedList(result%10);
            carry = result/10;
        }
        
        ll3.traverseLinkedList();
    }

    // Q.5) Intersection of Linked List

    Node getKthNode(Node head, int k) {
        Node current = head;
        while (k>0 && current != null) {
          current = current.next;
          k--;
        }
        return current;
      }
    
      // Intersection Method
      Node findIntersection(LinkedList list1, LinkedList list2) {
        // if (list1.head == null || list2.head == null) return null;
        // if (list1.tail != list2.tail) {
        //   return null;
        // }
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size) {
          longer = list1.head;
          shorter = list2.head;
        } else {
          longer = list2.head;
          shorter = list1.head;
        }
        
        longer = getKthNode(longer, Math.abs(list1.size-list2.size));
        while (shorter.value != longer.value) {
          shorter = shorter.next;
          longer = longer.next;
        }
        return shorter;

      }

}
