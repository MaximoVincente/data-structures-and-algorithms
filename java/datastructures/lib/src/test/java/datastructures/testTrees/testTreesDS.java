package datastructures.testTrees;

import datastructures.trees.BinarySearchTrees;
import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class testTreesDS {

  @Test
  public void testInstantiateEmptyBinaryTree() {
    BinaryTree tree = new BinaryTree();
    assertEquals(tree.root, null);
  }

  @Test
  public void testInstantiateBinaryTreeWithRoot() {
    BinaryTree tree = new BinaryTree(new Node(9));
    assertEquals(tree.root.value, 9);
  }

  @Test
  public void testAddLeftAndRightChild() {

    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(11);
    tree.add(15);
    tree.add(9);
    tree.add(13);
    assertEquals(tree.root.value, 11);
    assertEquals(tree.root.right.value, 15);
    assertEquals(tree.root.left.value, 9);
    assertEquals(tree.root.right.left.value, 13);
  }

  @Test
  public void testBST() {
    BinarySearchTrees root = new BinarySearchTrees();
    root.add(4);
    assertEquals(4, root.root.value);
  }

  @Test
  public void testPreOrder() {

    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(9);
    tree.add(6);
    tree.add(18);
    tree.add(11);
    tree.add(13);
    ArrayList actualValues = tree.preOrder();
    ArrayList expectedValues = new ArrayList(Arrays.asList(9,6,18,11,13));
    assertEquals(actualValues, expectedValues);
  }

  @Test
  public void testInOrder() {
    // Enter code here
    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(9);
    tree.add(6);
    tree.add(18);
    tree.add(11);
    tree.add(13);
    ArrayList actualValues = tree.inOrder();
    ArrayList expectedValues = new ArrayList(Arrays.asList(6,9,11,13,18));
    assertEquals(actualValues, expectedValues);
  }

  @Test
  public void testPostOrder() {
    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(9);
    tree.add(6);
    tree.add(18);
    tree.add(11);
    tree.add(13);
    ArrayList actualValues = tree.postOrder();
    ArrayList expectedValues = new ArrayList(Arrays.asList(6,13,11,18,9));
    assertEquals(actualValues, expectedValues);
  }

  @Test
  public void testTreeContains() {

    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(3);
    tree.add(6);
    tree.add(9);
    tree.add(12);
    assertTrue(tree.contains(12));
    assertTrue(tree.contains(9));
    assertTrue(tree.contains(6));
    assertTrue(tree.contains(3));
    assertFalse(tree.contains(29));
  }

  @Test
  public void testFindMaxValue() {

    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(3);
    tree.add(6);
    tree.add(9);
    tree.add(12);
    tree.add(7);
    tree.add(11);
    ArrayList actualValues = tree.findMaxValue();
    ArrayList maxValue = new ArrayList(Arrays.asList());
    assertEquals(actualValues, maxValue);
  }

}
