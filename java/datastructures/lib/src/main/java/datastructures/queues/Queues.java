package datastructures.queues;

public class Queues {

  Node front = null;
  Node back = null;
  int length = 0;

  public int length() {
    return length;
  }

  public void enqueue (int value){
    Node newFront = new Node(value);
    if(length == 0) {
      front = newFront;
    }else{
      back.next = newFront;
      back = newFront;
      length++;
    }
  }

  public int dequeue (){
    int val = front.value;
    front = front.next;
    length--;
    return val;
  }

  public int peek(){
    return front.value;
  }

  public boolean isEmpty(){
    return length == 0;
  }


}
