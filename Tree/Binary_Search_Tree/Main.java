/**
 * Main
 */
class Main {

  public static void main(String[] args) {
    System.out.println();
    BinarySearchTree newBST = new BinarySearchTree();
    newBST.insert(70);
    newBST.insert(50);
    newBST.insert(90);
    newBST.insert(100);
    newBST.insert(80);
    newBST.insert(30);
    newBST.insert(60);
    newBST.insert(20);
    newBST.insert(40);
    BinaryNode root = newBST.root;
    //newBST.preOrder(root);
    //newBST.inOrder(root);
    // newBST.postOrder(root);
    //newBST.levelOrder();
    newBST.levelOrder();
    System.out.println();
    newBST.deleteNode(root, 90);
    newBST.levelOrder();
  }
}
