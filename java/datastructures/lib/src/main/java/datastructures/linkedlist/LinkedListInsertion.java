package datastructures.linkedlist;


public class LinkedListInsertion {

  Node head = null;
//  Node tail = null;  // not strictly required

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;

    Node end = head;
    while (end.next != null);
    end = end.next;

    end.next = newNode;
  }



  public boolean includes(int value)
  {
    Node current = head;
    while (current != null) {
      if (current.value == value)
        return true;
      current = current.next;
    }
    return false;
  }

}
