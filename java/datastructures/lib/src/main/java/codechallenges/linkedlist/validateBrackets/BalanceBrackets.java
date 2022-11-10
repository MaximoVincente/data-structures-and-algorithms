package codechallenges.linkedlist.validateBrackets;

import codechallenges.linkedlist.validateBrackets.Node;
import datastructures.stack.Stack;
import java.util.ArrayList;

public class BalanceBrackets {

  public boolean validateBrackets(String expression){
    Stack stack = new Stack();

    ArrayList<Character> openBrackets = new ArrayList<>();
    openBrackets.add('[');
    openBrackets.add('{');
    openBrackets.add('(');
    ArrayList<Character> closeBrackets = new ArrayList<>();
    closeBrackets.add(']');
    closeBrackets.add('}');
    closeBrackets.add(')');

    for (int i = 0; i < expression.length(); i++) {
      char el = expression.charAt(i);

      if (el == '(' || el == '[' || el == '{') {
        stack.push(el);
        continue;
      }

      if (stack.isEmpty()){
        return false;
      }

      char validate;

      switch (el) {
        case ')':
          validate = (char) stack.pop();
          if(validate == '{' || validate == '[')
            return false;
          break;
        case '}':
          validate = (char) stack.pop();
          if (validate == '(' || validate == '[')
            return false;
          break;
        case ']' :
          validate = (char) stack.pop();
          if (validate == '(' || validate == '{')
            return false;
          break;
      }
    }
    return (stack.isEmpty());
  }
}
