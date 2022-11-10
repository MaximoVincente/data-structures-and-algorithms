package codechallenges.linkedlist.testBalancedBrackets;

import codechallenges.linkedlist.validateBrackets.BalanceBrackets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testBalancedBrackets {

  @Test
  void testBalancedBrackets() {
    BalanceBrackets sut = new BalanceBrackets();

    assertFalse(sut.validateBrackets("([{}])"));


  }

  @Test
  void testEmptyStack() {
    BalanceBrackets sut = new BalanceBrackets();
    assertTrue(sut.validateBrackets(""));
  }
}

