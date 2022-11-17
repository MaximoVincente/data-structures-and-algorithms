package codechallenges.linkedlist.trees;

import datastructures.trees.KaryNode;
import datastructures.trees.Node;
import datastructures.trees.BinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

  public void breadthFirstTraversal() {
    Node root = null;
    if (root == null) {
      return;
    }
    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      Node node = nodes.remove();
      if (node.left != null) {
        nodes.add(node.left);
      }
      if (node.right != null) {
        nodes.add(node.right);
      }
    }
  }

}
