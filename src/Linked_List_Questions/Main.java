package Linked_List_Questions;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        Questions q = new Questions();
        ll.createLinkedList(7);
        ll.insertLinkedList(6);
        ll.insertLinkedList(2);
        ll.insertLinkedList(1);
        ll2.createLinkedList(5);
        ll2.insertLinkedList(6);
        ll2.insertLinkedList(2);
        ll2.insertLinkedList(1);
        // ll.insertLinkedList(10);
        // ll.insertLinkedList(11);
        // -----------Q.1-------------
        // ll.traverseLinkedList();
        // q.deleteDups(ll);
        // ll.traverseLinkedList();
        // -----------Q.2-------------
        // q.noOfElements(ll,6);
        // -----------Q.3-------------
        // q.partition(ll,10);
        // -----------Q.4-------------
        // ll.traverseLinkedList();
        // ll2.traverseLinkedList();
        // q.sumOfList(ll, ll2);
        // -----------Q.5-------------
        ll.traverseLinkedList();
        ll2.traverseLinkedList();
        System.out.println(q.findIntersection(ll, ll2).value);
        // q.findIntersection(ll, ll2);
    }
}
