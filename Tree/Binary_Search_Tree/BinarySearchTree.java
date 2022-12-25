import java.util.*;

/**
 * BinarySearchTree
 */

//Time and Space is O(1)
class BinarySearchTree {
  public BinaryNode root;

  public BinarySearchTree() {
    root = null;
    System.out.println("Binary Search Tree created");
  }

  //Insert Method
  //Time is O(log n) Space is O(log n)
  private BinaryNode insert(BinaryNode currentNode, int value) {
    if (currentNode == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.value = value;
      if (this.root == null) {
        this.root = newNode;
      }
      System.out.println("The value successfully inserted");
      return newNode;
    } else if (value <= currentNode.value) {
      currentNode.left = insert(currentNode.left, value); //O(n/2)
      return currentNode;
    } else {
      currentNode.right = insert(currentNode.right, value); //O(n/2)
      return currentNode;
    }
  }

  //Automatically passes the root as the arguement everytime
  void insert(int value) {
    insert(root, value);
  }

  //preOrder
  //Time and space is O(n), because of stack memory
  void preOrder(BinaryNode node) {
    //base case
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left); //O(n)
    preOrder(node.right); //O(n)
  }

  //inOrder Traversal
  //Time and Space is O(n) because of stack memory
  public void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }

  //postOrder Traversal
  //Time and space is O(n) because of stack memory
  void postOrder(BinaryNode node) {
    //base case
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }

  //levelOrder
  //time and space is O(n) because we enqueue and dequeue
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      System.out.print(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
  }

  //Search
  //time is O(log n)
  BinaryNode search(BinaryNode node, int value) {
    //base case
    if (node == null) {
      System.out.println("Value " + value + " not found in BST");
      return null;
      //base case
    } else if (node.value == value) {
      System.out.printf("Value %d found in BST%n", value);
      return node;
    } else if (value < node.value) {
      return search(node.left, value); //O(n/2)
    } else {
      return search(node.right, value); //O(n/2)
    }
  }

  //Minimum node
  //Average Case: Time and Space Complexity - O(log n)
  //Worst Case: Time and Space Complexity - O(n)
  public static final BinaryNode minimumNode(BinaryNode root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  //Delete node
  //Time and space is O(Log n)
  public BinaryNode deleteNode(BinaryNode root, int value) {
    //Case 1: The node has 2 children
    if (root == null) {
      System.out.println("Value not found in BST");
      return null;
    }
    if (value < root.value) {
      root.left = deleteNode(root.left, value); //O(n/2)
    } else if (value > root.value) {
      root.right = deleteNode(root.right, value); //O(n/2)
    } else {
      //Case 1: The node has two children
      if (root.left != null && root.right != null) {
        BinaryNode temp = root;
        BinaryNode minNodeForRight = minimumNode(temp.right); //O(Log n) only going on one side
        root.value = minNodeForRight.value;
        root.right = deleteNode(root.right, minNodeForRight.value); //O(n/2)
        //Case 2: The node has 1 child
      } else if (root.left != null) {
        root = root.left;
      } else if (root.right != null) {
        root = root.right;
      } else {
        //Case 3: The node is a leaf node
        root = null;
      }
    }
    return root;
  }

  //Delete BST
  //Time and Space complexity is O(1)
  public void deleteBST() {
    root = null;
    System.out.println("BST has been deleted successfully");
  }
}
