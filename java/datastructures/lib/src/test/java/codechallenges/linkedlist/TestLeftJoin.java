package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeftJoin {

  @Test
  public void testLeftWithJoins(){
    HashMap h1 = new HashMap();
    h1.put("wally", "dog");
    h1.put("gypsy", "cat");
    h1.put("linc", "pup");

    HashMap h2 = new HashMap();
    h2.put("wally", "westie");
    h2.put("gypsy", "siamese");
    h2.put("linc", "collie");

    List<String> list = new ArrayList<>();
    list.add("gypsy: cat, siamese");
    list.add("linc: pup, collie");
    list.add("wally: dog, westie");

    assertEquals(list, LeftJoin.leftJoin(h1, h2));
  }

  @Test
  public void testLeftWithNull(){
    HashMap h1 = new HashMap();
    h1.put("wally", "dog");
    h1.put("gypsy", "cat");
    h1.put("linc", "pup");
    h1.put("buddy", "retriever");

    HashMap h2 = new HashMap();
    h2.put("wally", "westie");
    h2.put("gypsy", "siamese");
    h2.put("linc", "collie");

    List<String> list = new ArrayList<>();
    list.add("gypsy: cat, siamese");
    list.add("linc: pup, collie");
    list.add("wally: dog, westie");
    list.add("buddy: retriever, null");
    assertEquals(list, LeftJoin.leftJoin(h1, h2));
  }


  @Test
  public void test_leftBothEmptyHashMap(){
    HashMap h1 = new HashMap();
    HashMap h2 = new HashMap();

    List<String> list = new ArrayList<>();
    assertEquals(list, LeftJoin.leftJoin(h1, h2));

  }
}
