package codechallenges.linkedlist;

import datastructures.hashmap.HashMap;
import datastructures.trees.BinaryTree;
import datastructures.trees.Node;

import java.util.ArrayList;

public class TreeIntersection {

  public ArrayList<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    HashMap<Integer, Boolean> hashmap1 = new HashMap<>(1024);
    HashMap<Integer, Boolean> hashmap2 = new HashMap<>(1024);
    ArrayList<Integer> list = new ArrayList<>();
    addToHashMap(tree1.root, hashmap1);
    addToHashMap(tree2.root, hashmap2);
    for (Integer element : hashmap1.keys()) {
      if (hashmap2.contains(element))
        list.add(element);
    }
    return list;
  }

  private void addToHashMap(Node root, HashMap<Integer, Boolean> hashmap) {
    if (root == null)
      return;
    hashmap.set(root.value, true);
    addToHashMap(root.left, hashmap);
    addToHashMap(root.right, hashmap);
  }

}
