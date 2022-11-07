package datastructures.stack;


public class Stack  {

    Node top = null;
    int length = 0;

    public int length() {
      return length;
    }
public void push (int value) {

  Node newTop = new Node(value);
  newTop.next = top;
  top = newTop;
  length ++;
  }

  public int pop (){

  Node entry= top;
  top = top.next;
  length --;
  return entry.value;
  }

  public int peek(){

  return top.value;
  }

  public boolean isEmpty(){
    return length == 0;
  }



}
