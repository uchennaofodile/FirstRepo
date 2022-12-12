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

  //levelOrder
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      System.out.println(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }

      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
    }
  }
}
