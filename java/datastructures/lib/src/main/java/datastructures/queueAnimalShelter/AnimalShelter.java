package datastructures.queueAnimalShelter;
import datastructures.queueAnimalShelter.Animal;
import datastructures.queues.Node;

import java.util.Stack;

public class AnimalShelter {

public static Stack<String> shelter1 = new Stack<>();
static Stack<String> shelter2 = new Stack<>();

  public void enqueue(String animal){
    while (!shelter1.isEmpty()) {
      shelter2.push(shelter1.pop());
    }

    shelter1.push(animal);

    while (!shelter2.isEmpty()) {
      shelter1.push(shelter2.pop());
    }
  }

 public String dequeue(String pref){
   if(shelter1.isEmpty()){
     System.out.println(pref + " is null");
     return null;
   }
   else{
     String deq = shelter1.pop();
     return deq;
   }
 }

  public boolean isEmpty(){
    return true;
  }

}
