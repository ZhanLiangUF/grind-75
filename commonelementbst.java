import java.util.ArrayList;

public class commonelementbst {
  class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree {
 
    Node root1, root2;
 
    // A utility function to do inorder traversal
    void inorder(Node root, ArrayList<Integer> traversal)
    {
        if (root != null) {
            inorder(root.left, traversal);
            traversal.add(root.key);
            inorder(root.right, traversal);
        }
    }
 
    // Function two print common elements in given two trees
    void printCommon()
    {
        ArrayList<Integer> inorder1
            = new ArrayList<Integer>();
        ArrayList<Integer> inorder2
            = new ArrayList<Integer>();
        // Storing inorder traversal of both the trees
        inorder(root1, inorder1);
        inorder(root2, inorder2);
 
        System.out.println("Tree 1 : ");
        for (int i = 0; i < inorder1.size(); i++) {
            System.out.print(inorder1.get(i) + " ");
        }
        System.out.println();
 
        System.out.println("Tree 2 : ");
        for (int i = 0; i < inorder2.size(); i++) {
            System.out.print(inorder2.get(i) + " ");
        }
        System.out.println();
 
        System.out.println("Common Nodes: ");
 
        // Using two pointers calculating common nodes in
        // both the traversals
        int i = 0, j = 0;
        while (i < inorder1.size() && j < inorder2.size()) {
            if (inorder1.get(i) == inorder2.get(j)) {
                System.out.print(inorder1.get(i) + " ");
                i++;
                j++;
            }
            else if (inorder1.get(i) < inorder2.get(j)) {
                i++;
            }
            else {
                j++;
            }
        }
    }
 
    // A utility function to insert a new Node
    // with given key in BST
    Node insert(Node node, int key)
    {
        // If the tree is empty, return a new Node
        if (node == null) {
            return new Node(key);
        }
 
        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        }
        else if (key > node.key) {
            node.right = insert(node.right, key);
        }
 
        // Return the (unchanged) Node pointer
        return node;
    }
 
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
 
        // Create first tree as shown in example
        tree.root1 = tree.insert(tree.root1, 5);
        tree.root1 = tree.insert(tree.root1, 1);
        tree.root1 = tree.insert(tree.root1, 10);
        tree.root1 = tree.insert(tree.root1, 0);
        tree.root1 = tree.insert(tree.root1, 4);
        tree.root1 = tree.insert(tree.root1, 7);
        tree.root1 = tree.insert(tree.root1, 9);
 
        // Create second tree as shown in example
        tree.root2 = tree.insert(tree.root2, 10);
        tree.root2 = tree.insert(tree.root2, 7);
        tree.root2 = tree.insert(tree.root2, 20);
        tree.root2 = tree.insert(tree.root2, 4);
        tree.root2 = tree.insert(tree.root2, 9);
 
        tree.printCommon();
    }
}
}
