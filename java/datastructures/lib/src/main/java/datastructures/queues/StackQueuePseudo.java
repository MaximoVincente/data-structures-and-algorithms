package datastructures.queues;

import java.util.Stack;

public class StackQueuePseudo {

  static Stack<Integer> stack1 = new Stack<>();
  static Stack<Integer> stack2 = new Stack<>();

  public void enqueue (int val) {

    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }

    stack1.push(val);

    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
  }
  public int dequeue() {
    int top = stack1.peek();
    stack1.pop();
    return top;
  }
}
