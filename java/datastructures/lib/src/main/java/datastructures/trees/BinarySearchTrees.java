package datastructures.trees;

import java.util.ArrayList;

public class BinarySearchTrees {

  public Node root = null;

  public void add(int value) {
    // Adds a new node with that value in the correct location in the binary search tree.
    Node node = new Node(value);

    if (root == null) {
      root = node;
      return;
    }

    Node current = root;

    while (current != null) {
      if (value < current.value) {

        if (current.left == null) {
          current.left = node;
          return;
        } else {
          current = current.left;
        }

      } else if (value > current.value) {

        if (current.right == null) {
          current.right = node;
          return;
        } else {
          current = current.right;
        }

      } else {
        return;
      }
    }
  }

  // Each depth first traversal method should return an array of values, ordered appropriately.
  public ArrayList preOrder() {
    ArrayList values = new ArrayList();
    preOrder(root, values);
    return values;
  }

  public void preOrder(Node node, ArrayList values) {
    // node -> left -> right
    if (node == null) return;

    values.add(node.value);
    preOrder(node.left, values);
    preOrder(node.right, values);


  }

  public ArrayList inOrder() {
    ArrayList values = new ArrayList();
    inOrder(root, values);
    return values;
  }

  public void inOrder(Node node, ArrayList values) {
    // left -> node -> right
    if (node == null) return;

    inOrder(node.left, values);
    values.add(node.value);
    inOrder(node.right, values);
  }

  public ArrayList postOrder() {
    ArrayList values = new ArrayList();
    postOrder(root, values);
    return values;
  }

  public void postOrder(Node node, ArrayList values) {
    // left -> right -> node
    if (node == null) return;

    postOrder(node.left, values);
    postOrder(node.right, values);
    values.add(node.value);
  }

  public boolean contains(int value) {
    Node current = root;
    while (current != null) {
      if (value < current.value) {
        if (current.left == null) {
          return false;
        } else {
          current = current.left;
        }
      } else if (value > current.value) {
        if (current.right == null) {
          return false;
        } else {
          current = current.right;
        }
      } else {
        return true;
      }
    }
    return false;
  }

  public ArrayList findMaxValue() {
    ArrayList values = new ArrayList();
    findMaxValue(root, values);
    return values;
  }

  public int findMaxValue(Node node, ArrayList values) {
    // node -> left -> right
    if (node == null) return 0;

    int logic = (node.value);
    int lNode = findMaxValue(node.left, values);
    int rNode = findMaxValue(node.right, values);

    if (lNode > logic)
      logic = lNode;
    if(rNode > logic)
      logic = rNode;
      return logic;
  }

}
