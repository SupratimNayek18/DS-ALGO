package Single_Linked_List;

public class Main {
  public static void main(String[] args) {
      LinkedList l = new LinkedList();
      l.createLinkedList(5);
      System.out.println(l.head.value);
      l.insertInLinkedList(6,1);
      l.insertInLinkedList(7,2);
      l.insertInLinkedList(8,3);
      // System.out.print(l.tail.value);
      l.traverseLinkedList();
      // l.searchLinkedList(6);
      l.deleteLinkedList(1);
      l.traverseLinkedList();
  }  
}
