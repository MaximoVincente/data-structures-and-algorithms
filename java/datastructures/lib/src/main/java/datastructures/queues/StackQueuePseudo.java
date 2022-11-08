package datastructures.queues;

import java.util.Stack;

public class StackQueuePseudo {

  Node front = null;
  Node back = null;

  static Stack<Integer> stack1 = new Stack<>();
  static Stack<Integer> stack2 = new Stack<>();

  public void enqueue (int value){

    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());

    }
    stack1.push(value);
    while (!stack2.isEmpty());
    stack1.push(stack2.pop());

  }

  public int dequeue() {

    int top = stack1.peek();
    stack1.pop();

    return top;
  }

  public int peek(){
    return front.value;
  }

}
