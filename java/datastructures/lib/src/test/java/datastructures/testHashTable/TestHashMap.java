package datastructures.testHashTable;


import datastructures.hashmap.HashMap;
import datastructures.hashmap.HashMapRepeatedWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {



  @Test
  void set() {
    HashMap<String, Integer> sut = new HashMap<>(1024);
    sut.set("Wally", 38);
    assertEquals(sut.get("Wally"), 38);
  }

  @Test
  void testContains() {
    HashMap<String, Integer> sut = new HashMap<>(1024);
    sut.set("Wally", 29);
    assertTrue(sut.contains("Wally"));
  }

  @Test
  void testGet() {
    HashMap<String, Integer> sut = new HashMap<>(1024);
    sut.set("Wally", 29);
    assertEquals(sut.get("Wally"), 29);
  }

  @Test
  void testGetNullValue() {
    HashMap<String, Integer> sut = new HashMap<>(1024);
    sut.set("Wally", 29);
    assertNull(sut.get("Wallyburt"));
  }

  @Test
  void testCollisions() {
    HashMap<Integer, Integer> sut = new HashMap<>(1024);
    sut.set(11, 4);
    sut.set(22, 8);
    sut.set(44, 12);
    sut.set(88, 24);
  }

  @Test
  void testRetrieveCollision() {
    HashMap<Integer, Integer> sut = new HashMap<>(1024);
    sut.set(0, 1);
    sut.set(10, 2);
    sut.set(20, 3);
    assertEquals(sut.get(0), 1);
    assertEquals(sut.get(10), 2);
    assertEquals(sut.get(20), 3);
  }

  @Test
  void testHashKeyInRange() {
    HashMap<String, Integer> sut = new HashMap<>(1024);

  }

  @Test
  void testHashmapRepeatedWords() {
    HashMapRepeatedWord sut = new HashMapRepeatedWord();
    String word = "Wally went on an adventure to find his favorite treat, blueberries. We found a blueberry tree at the neighbors farm, and started eating the ones in the ground.";
    assertEquals(sut.repeatedWord(word), "the");
  }

}

