package datastructures.queues;

public class Queues {

  Node front = null;
  Node back = null;

  public void enqueue (int value){
    Node newFront = new Node(value);
    if( isEmpty()) {
      front = newFront;
    }else{
      back.next = newFront;
      back = newFront;

    }
  }

  public int dequeue (){
    int val = front.value;
    front = front.next;

    return val;
  }

  public int peek(){
    return front.value;
  }

  public boolean isEmpty(){
    return true;
  }


}
