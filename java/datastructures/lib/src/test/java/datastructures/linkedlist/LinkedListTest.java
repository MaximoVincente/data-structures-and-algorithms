package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  void testAMethod() {
    LinkedList sut = new LinkedList();
    System.out.println(sut);
    assertTrue(true);
  }

  @Test
  void instantiateEmptyLinkedList() {
    LinkedList sut = new LinkedList();
    Node actual = sut.head;
    assertTrue(actual == null);
  }

  @Test
  void insertEmptyLinkedList() {
    LinkedList sut = new LinkedList();
    sut.insert(4);
    int actual = sut.head.value;
    int expected = 4;
    assertTrue(actual == expected);
  }

  @Test
  void insertMultipleLinkedList() {
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertTrue(sut.head.value == 5);
    assertTrue(sut.head.next.value == 4);
    assertTrue(sut.head.next.next == null);
  }

  @Test
  void includesTrue() {
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertTrue(sut.includes(4));
  }

  @Test
  void includesFalse() {
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertFalse(sut.includes(6));
  }

  @Test
  void returnString() {
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    sut.insert(11);
    String expected = "{ 11 } -> { 5 } -> { 4 } -> NULL";
    String actual = sut.toString();
    assertEquals(expected, actual);
  }

  @Test
  void appendNode() {
    LinkedListInsertion sut = new LinkedListInsertion();
    sut.append(9);
    int actual = sut.head.value;
    int expected = 9;
    assertTrue(actual == expected);

  }

  @Test
  void insertAfterTest() {
    LinkedList sut = new LinkedList();
    LinkedListInsertion sat = new LinkedListInsertion();
    sut.insert(11);
    sut.insert(13);
    sat.append(9);
    sat.insertAfter(null, 9);


  }

  @Test
  void insertBeforeTest() {
    LinkedListInsertion sat = new LinkedListInsertion();
    sat.append(9);
//    sat.in(null, 38);
  }

  @Test
  void greaterThanLengthOfList() {
    LinkedList sut = new LinkedList();
    Node k1 = new Node(1);
    Node k2 = new Node(2);
    Node k3 = new Node(4);
    Node k4 = new Node(6);
    Node k5 = new Node(5);
    k1.next = k2;
    k2.next = k3;
    k3.next = k4;
    k4.next = k5;
    System.out.println(sut.kthLinkedList(k2, 1));
    assertEquals(6, sut.kthLinkedList( k2, 1));
  }

  @Test
  void sameLengthOfList() {
    LinkedList sut = new LinkedList();
    Node k1 = new Node(1);
    Node k2 = new Node(2);
    Node k3 = new Node(4);
    Node k4 = new Node(6);
    Node k5 = new Node(5);
    k1.next = k2;
    k2.next = k3;
    k3.next = k4;
    k4.next = k5;
    System.out.println(sut.kthLinkedList(k4, 0));
    assertEquals(5, sut.kthLinkedList( k4, 0));
  }

  @Test
  void LengthOfOne() {
    LinkedList sut = new LinkedList();
    Node k1 = new Node(1);

    System.out.println(sut.kthLinkedList(k1, 0));
    assertEquals(1, sut.kthLinkedList( k1, 0));
  }

  @Test
  void HappyPath() {
    LinkedList sut = new LinkedList();
    Node k1 = new Node(1);
    Node k2 = new Node(2);
    Node k3 = new Node(4);
    Node k4 = new Node(6);
    Node k5 = new Node(5);
    k1.next = k2;
    k2.next = k3;
    k3.next = k4;
    k4.next = k5;
    System.out.println(sut.kthLinkedList(k3, 2));
    assertEquals(4, sut.kthLinkedList( k3, 2));
  }
}
