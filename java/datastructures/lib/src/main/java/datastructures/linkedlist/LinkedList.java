package datastructures.linkedlist;

import datastructures.linkedlist.Node;
public class LinkedList {

  Node head = null;
    Node tail = null;  // not strictly required

  public void insert(int value) {
   Node newNode = new Node(value);
   newNode.next = head;
   head = newNode;
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
  @Override
  public String toString() {
  String parts = "";
  Node current = head;

  while (current != null){
    parts += "{ " + current.value + " } " + "-> ";
    current = current.next;
    System.out.println("{ " + parts + " } " + "-> " + "NULL");

  }
      return parts + "NULL";

    }
}
