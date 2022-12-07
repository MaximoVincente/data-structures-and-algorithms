package codechallenges.linkedlist;

import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTreeIntersection {

  @Test
  void example() {
    TreeIntersection sut = new TreeIntersection();
    BinaryTree tree1 = new BinaryTree();
    new Node(230);
    new Node(180);
    new Node(280);
    new Node(3);
    new Node(194);
    new Node(120);
    new Node(190);

    BinaryTree tree2 = new BinaryTree();
    new Node(230);
    new Node(180);
    new Node(280);
    new Node(300);
    new Node(450);
    new Node(120);
    new Node(790);

    ArrayList<Integer> testList = sut.treeIntersection(tree1, tree2);
    Collections.sort(testList);
    System.out.println(testList.toString());
//    assertEquals(testList.toString(), "[230, 180, 280, 3, 194, 120, 190]");
  }

}
