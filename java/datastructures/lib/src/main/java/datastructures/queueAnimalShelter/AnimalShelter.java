package datastructures.queueAnimalShelter;

public class AnimalShelter {

  Node front = null;
  Node back = null;

  public void enqueue(String animal){
    Node newFront = new Node (animal);
    if (isEmpty()) {
      front = newFront;
    }else{
      back.next = newFront;
      back = newFront;
    }
  }



  public boolean isEmpty(){
    return true;
  }
  public String peek(){
    return front.value;
  }
}
