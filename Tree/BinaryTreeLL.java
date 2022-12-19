//import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
  BinaryNode root;

  //O(1) Space and Time
  public BinaryTreeLL() {
    this.root = null; //creating BinaryTreeLL
  }

  //PreOrder Traversal
  //O(n) time O(n) space -- inserts node in stack memory
  void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left); //O(n/2)
    preOrder(node.right);
    //extracted(node); //O(n/2)
  }

  // private void extracted(BinaryNode node) {
  //   preOrder(node.right);
  // }

  // public void getExtracted(BinaryNode node) {
  //   extracted(node);
  // }

  //inOrder
  //time is O(N) space is O(N) we insert the node into stack memory
  public void inOrder(BinaryNode node) {
    if (node == null) { //O(1)
      return; //O(1)
    }

    inOrder(node.left); //because we have two children in binary node //O(N/2)
    System.out.print(node.value + " ");
    inOrder(node.right); //O(N/2)
  }

  //postOrder
  //time and space O(N)
  void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }

  //levelOrder - Time is O(n) / Space is O(n)
  //space is allocated in the memory based on the number
  //of elemenets in enqueued
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) { //O(n)
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

  // Search Method
  //Time and space is O(n) because memory is assigned based on the number of elements
  //if number of elements is n we must allocate n space of memory in the queue
  public void search(String value) {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) { //---->O(n)
      BinaryNode presentNode = queue.remove();
      if (presentNode.value == value) {
        System.out.println("The value-" + value + " is found in the Tree");
        return;
      } else {
        if (presentNode.left != null) {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null) {
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println("The value-" + value + " is not found in the Tree");
  }

  //Insert Method
  //time and space is O(n)
  public void insert(String value) {
    BinaryNode newNode = new BinaryNode();
    newNode.value = value;
    if (root == null) {
      root = newNode;
      System.out.println("Inserted new node at Root");
      return;
    }

    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) { //o(n)
      BinaryNode presentNode = queue.remove();
      if (presentNode.left == null) {
        presentNode.left = newNode;
        System.out.println("Successfully inserted at left!");
        break;
      } else if (presentNode.right == null) {
        presentNode.right = newNode;
        System.out.println("Sucessfully inserted at right!");
        break;
      } else {
        queue.add(presentNode.left);
        queue.add(presentNode.right);
      }
    }
  }

  //Delete a node

  //1. Get Deepest Node
  public BinaryNode getDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while (!queue.isEmpty()) {
      presentNode = queue.remove();
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
    return presentNode;
  }

  //Delete Deepest node
  public void deleteDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode previousNode, presentNode = null;
    while (!queue.isEmpty()) {
      previousNode = presentNode;
      // if (previousNode != null) {
      //   System.out.println("previousNode: " + previousNode.value);
      // }
      presentNode = queue.remove();
      // System.out.println("presentNode: " + presentNode.value);
      if (presentNode.left == null) {
        previousNode.right = null;
        return;
      } else if (presentNode.right == null) {
        presentNode.left = null;
        return;
      }
      queue.add(presentNode.left);
      queue.add(presentNode.right);
    }
  }

  //Delete given node
  //Time and space is O(N)
  void deleteNode(String value) {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) { //O(n)
      BinaryNode presentNode = queue.remove();
      if (presentNode.value == value) {
        presentNode.value = getDeepestNode().value; //O(n)
        deleteDeepestNode(); //O(N)
        System.out.println("The node is deleted!!");
        return;
      } else {
        if (presentNode.left != null) {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null) {
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println("The node does not exist in this BT");
  }

  //Delete entire binary tree
  //Time and space is O(1)
  public void deleteBinaryTree() {
    root = null;
    System.out.println("Binary Tree has been successfully deleted!S");
  }
}
