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

  public boolean includes(int value) {
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

    while (current != null) {
      parts += "{ " + current.value + " } " + "-> ";
      current = current.next;
      System.out.println("{ " + parts + " } " + "-> " + "NULL");

    }
    return parts + "NULL";

  }


  public int kthLinkedList(Node head, int k) {

    Node current = head;
    Node temp = head;

    for (int i = 0; i < k; i++) {
      temp = temp.next;
    }

    while (temp.next != null) {
      temp = temp.next;
      current = current.next;
    }
    return current.value;
  }


  public LinkedList reverseLinkedList(LinkedList LL) {
    Node current = LL.head;
    Node previous = null;
    Node temp;

    while(current != null) {
      temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }

    LL.head = previous;

    return LL;
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

  public void linkedListZip(LinkedList b) {

    Node currA = head, currB = b.head;
    Node nextA, nextB;

    while(currA != null && currB != null) {
      nextA = currA.next;
      nextB =currB.next;

      currB.next = nextA;
      currA.next = currB;

      currA = nextA;
      currB = nextB;
    }
    b.head = currB;
  }

}
