package codechallenges.linkedlist.animalshelterqueue;

import datastructures.queueAnimalShelter.Animal;
import datastructures.queueAnimalShelter.AnimalShelter;
import datastructures.queues.StackQueuePseudo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAnimalShelter {

  @Test
  void testQueuesEnqueue() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue("dog");
    sut.enqueue("dog");

    assertEquals("dog", sut.shelter1.peek());
  }
  @Test
  void testStackQueuePseudoDequeue() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue("dog");
    sut.enqueue("cat");
    sut.enqueue("dog");
    assertEquals("dog", sut.dequeue("dog"));
  }
}
