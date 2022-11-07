package datastructures.queues;

import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

public class QueuesTest {

  @Test
  void testQueuesEnqueue() {
    Queues sut = new Queues();
    sut.enqueue(9);
    assert (sut.peek() == 9);
  }

//  @Test
//  void testQueuesMultipleEnqueue() {
//    Queues sut = new Queues();
//    sut.enqueue(9);
//    sut.enqueue(16);
//    sut.enqueue(21);
//    assert(sut.);
//  }

//  @Test
//  void testQueuesDequeue() {
//    Queues sut = new Queues();
//    sut.enqueue(11);
//    sut.enqueue(13);
//    sut.dequeue();
//    assert (sut.peek() == 11);
//  }

  @Test
  void testPeek() {
    Queues sut = new Queues();
    sut.enqueue(18);
    assert(sut.peek() == 18);
  }

  @Test
  void testQueueDequeUntilIsEmpty() {
    Queues sut = new Queues();
    sut.enqueue(9);
    sut.enqueue(13);
    while(!sut.isEmpty()){
      sut.dequeue();
    }
    assert (sut.isEmpty());
  }

}
