package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeftJoin {

  @Test
  public void testLeftWithJoins(){
    HashMap hashtable1 = new HashMap();
    hashtable1.put("wally", "dog");
    hashtable1.put("gypsy", "cat");
    hashtable1.put("linc", "pup");

    HashMap hashtable2 = new HashMap();
    hashtable2.put("wally", "westie");
    hashtable2.put("gypsy", "siamese");
    hashtable2.put("linc", "collie");

    List<String> list = new ArrayList<>();
    list.add("gypsy: cat, siamese");
    list.add("linc: pup, collie");
    list.add("wally: dog, westie");

    assertEquals(list, LeftJoin.leftJoin(hashtable1, hashtable2));
  }

  @Test
  public void testLeftWithNull(){
    HashMap hashtable1 = new HashMap();
    hashtable1.put("wally", "dog");
    hashtable1.put("gypsy", "cat");
    hashtable1.put("linc", "pup");
    hashtable1.put("buddy", "retriever");

    HashMap hashtable2 = new HashMap();
    hashtable2.put("wally", "westie");
    hashtable2.put("gypsy", "siamese");
    hashtable2.put("linc", "collie");

    List<String> list = new ArrayList<>();
    list.add("gypsy: cat, siamese");
    list.add("linc: pup, collie");
    list.add("wally: dog, westie");
    list.add("buddy: retriever, null");
    assertEquals(list, LeftJoin.leftJoin(hashtable1, hashtable2));
  }


  @Test
  public void test_leftBothEmptyHashMap(){
    HashMap hashtable1 = new HashMap();
    HashMap hashtable2 = new HashMap();

    List<String> list = new ArrayList<>();
    assertEquals(list, LeftJoin.leftJoin(hashtable1, hashtable2));

  }
}
