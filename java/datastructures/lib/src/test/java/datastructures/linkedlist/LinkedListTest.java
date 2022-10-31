package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

  @Test void instantiateEmptyLinkedList() {
    LinkedList sut = new LinkedList();
    Node actual = sut.head;
    assertTrue(actual == null);
  }

  @Test void insertEmptyLinkedList(){
    LinkedList sut = new LinkedList();
    sut.insert(4);
    int actual = sut.head.value;
    int expected = 4;
    assertTrue(actual == expected);
  }

  @Test void insertMultipleLinkedList(){
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertTrue(sut.head.value == 5);
    assertTrue(sut.head.next.value == 4);
    assertTrue(sut.head.next.next == null);
  }

  @Test void includesTrue(){
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertTrue(sut.includes(4));
  }

  @Test void includesFalse(){
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    assertFalse(sut.includes(6));
  }

  @Test void returnString(){
    LinkedList sut = new LinkedList();
    sut.insert(4);
    sut.insert(5);
    sut.insert(11);
    String expected = "{ 11 } -> { 5 } -> { 4 } -> NULL";
    String actual = sut.toString();
    assertEquals(expected, actual);
  }

}


