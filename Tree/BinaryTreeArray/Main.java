import java.util.Arrays;

class Main {

  public static void main(String[] args) {
    System.out.println();
    BinaryTreeArray binaryTreeArray = new BinaryTreeArray(9);
    //Arrays.toString(binaryTreeArray);
    binaryTreeArray.insert("N1");
    binaryTreeArray.insert("N2");
    binaryTreeArray.insert("N3");
    binaryTreeArray.insert("N4");
    binaryTreeArray.insert("N5");
    binaryTreeArray.insert("N6");
    binaryTreeArray.insert("N7");
    binaryTreeArray.insert("N8");
    binaryTreeArray.insert("N9");
    //binaryTreeArray.preOrder(1);
    //binaryTreeArray.inOrder(1);
    System.out.println();
    //System.out.println(binaryTreeArray.arr[10]);
    binaryTreeArray.postOrder(1);
    System.out.println();
    binaryTreeArray.levelOrder();
    System.out.println();
    binaryTreeArray.search("N10");
    binaryTreeArray.delete("N5");
    binaryTreeArray.levelOrder();
    binaryTreeArray.deleteBinaryTree();
    //binaryTreeArray.levelOrder();
  }
}
