package datastructures.stack;

import org.junit.jupiter.api.Test;
public class StackTest {

  @Test
  void testStackPush() {
    Stack sut = new Stack();
    sut.push(11);
    assert(sut.peek() == 11);
  }

//  @Test
//  void testStackPushMultiple() {
//    Stack sut = new Stack();
//    sut.push(11);
//    sut.push(12);
//    sut.push(13);
//    assert(sut);
//  }

  @Test
  void testStackPop() {
    Stack sut = new Stack();
    sut.push(9);
    sut.push(13);
    sut.pop();
    assert (sut.peek() == 9);
  }

  @Test
  void testStackPopUntilIsEmpty() {
    Stack sut = new Stack();
    sut.push(9);
    sut.push(13);
    while(!sut.isEmpty()){
      sut.pop();
    }
    assert (sut.isEmpty());
  }

  @Test
  void testStackPeek() {
    Stack sut = new Stack();
    sut.push(7);
    assert (sut.peek() == 7);
  }

  @Test
  void testEmptyStack() {
    Stack sut = new Stack();
    assert (sut.isEmpty());
  }


}
