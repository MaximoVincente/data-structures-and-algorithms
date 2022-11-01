package datastructures.linkedlist;


public class LinkedListInsertion {

  Node head = null;
//  Node tail = null;  // not strictly required

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

  public void append(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;

  if (head == null) {
    head = newNode;
    return;
  }
  newNode.next = null;

  Node end = head;
  while (end.next != null)

    end = end.next;

  end.next = newNode;
  return;
  }

  public Node insertBefore(Node value, int newValue){
    if (head == value){
      Node newNode = new Node(newValue);
      newNode.next = head;

      head = newNode;
      return newNode;
    }
    else {
      Node prev = null;

      for (Node nod = head; nod != value; prev = nod, nod = nod.next);

      Node newNod = new Node(newValue);
      newNod.next = prev.next;
      prev.next = newNod;

      return newNod;
    }
  }


public void insertAfter(Node value, int newValue) {
    if (value == null) {
      return;
    }
    Node newNode = new Node(newValue);
    newNode.next = value.next;
    value.next = newNode;
    }

}
