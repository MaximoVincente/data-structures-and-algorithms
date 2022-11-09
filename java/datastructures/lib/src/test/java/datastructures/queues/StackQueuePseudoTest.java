package datastructures.queues;

import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackQueuePseudoTest {

  @Test
  void teststackQueueEnqueue() {
    StackQueuePseudo sut = new StackQueuePseudo();
    sut.enqueue(1);
    sut.enqueue(2);
//    System.out.println(sut.stack2);
    assertEquals(1, sut.stack1.peek());
  }

  @Test
  void testStackQueuePseudoDequeue() {
    StackQueuePseudo sut = new StackQueuePseudo();
    sut.enqueue(1);
    assertEquals(1, sut.dequeue());


  }
}
