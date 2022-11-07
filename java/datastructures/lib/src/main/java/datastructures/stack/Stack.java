package datastructures.stack;


public class Stack  {

    Node top = null;

public void push (int value) {

  Node newTop = new Node(value);
  newTop.next = top;
  top = newTop;

  }

  public int pop (){

  Node entry= top;
  top = top.next;
//  length --;
  return entry.value;
  }

  public int peek(){

  return top.value;
  }

  public boolean isEmpty(){
    return true;
  }



}
