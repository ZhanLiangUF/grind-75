class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}

public class binarysearchtree {
  Node root;

  binarysearchtree() {
    root = null;
  }

  Node insert(Node node, int key) {
    if (node == null) {
      return new Node(key);
    }

    if (key < node.key) {
      node.left = insert(node.left, key);
    } else if(key > node.key) {
      node.right = insert(node.right, key);
    }
    return node;
  }

  Node search(Node node, int key) {
    if (node == null || node.key == key) {
      return node;
    }
    if (node.key > key) {
      return search(node.left, key);
    }

    return search(node.right, key);
  }

}
