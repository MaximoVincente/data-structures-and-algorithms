package codechallenges.linkedlist.animalshelterqueue;

import datastructures.queueAnimalShelter.AnimalShelter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAnimalShelter {

  @Test
  void testQueuesEnqueue() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue("dog");
    assertTrue(sut.peek() == "dog");
  }
}
