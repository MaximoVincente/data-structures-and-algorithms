package codechallenges.linkedlist.trees;

import datastructures.trees.KaryNode;
import datastructures.trees.Node;
import datastructures.trees.BinaryTree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst <T extends Comparable<? super T>>{
  public Node<T> root;
  public void breadthFirstTraversal() {
    public Object[] breadthFirstTraversal() {
      ArrayList<T> outputList = new ArrayList<>();
      Queue<Node<T>> breadthQueue = new Queue<>();
      breadthQueue.enqueue(root);
      Node<T> front;
      while (!breadthQueue.isEmpty()) {
        front = breadthQueue.dequeue();
        outputList.add(front.value);
        if (front.left != null)
          breadthQueue.enqueue(front.left);
        if (front.right != null)
          breadthQueue.enqueue(front.right);
      }
      return outputList.toArray();
    }

}
