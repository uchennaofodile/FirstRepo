public class BinaryTreeArray {
  String[] arr;
  int lastUsedIndex;

  public BinaryTreeArray(int size) {
    arr = new String[size + 1];
    this.lastUsedIndex = 0;
    System.out.println(
      "Blank Array Binary Tree of size " + size + " has been created"
    );
  }

  //isFull
  boolean isFull() {
    if (arr.length - 1 == lastUsedIndex) {
      return true;
    } else {
      return false;
    }
  }

  //Insert Method
  //Space and Time is O(1)
  void insert(String value) {
    if (!isFull()) {
      arr[lastUsedIndex + 1] = value;
      lastUsedIndex++;
      System.out.println("The value of " + value + " has been inserted");
    } else {
      System.out.println("The BT is full");
    }
  }

  //PreOrder Traversal
  //O(N) time and space(inserts elements into the stack memory)
  public void preOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    System.out.print(arr[index] + " ");
    preOrder(index * 2); //O(N/2)
    preOrder(index * 2 + 1); //O(N/2)
  }

  //InOrder Traversal
  //time and space is O(n)
  public void inOrder(int index) {
    // base case
    if (index > lastUsedIndex) {
      return;
    }
    //recursion
    inOrder(index * 2); //O(n/2)
    System.out.print(arr[index] + " ");
    inOrder(index * 2 + 1); //O(n/2)
  }

  //PostOrder Traversal
  //Time and space is O(n)
  public void postOrder(int index) {
    //base case
    if (index > lastUsedIndex) {
      return;
    }

    //recursion
    postOrder(index * 2); //O(n/2)
    postOrder(index * 2 + 1); //O(n/2)
    System.out.print(arr[index] + " ");
  }

  //Level Order traversal - breath first
  //Time is O(n) Space is O(1)
  public void levelOrder() {
    for (int i = 1; i <= lastUsedIndex; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  //Search
  //Time is O(n) Space is O(1)
  public int search(String value) {
    for (int i = 1; i <= lastUsedIndex; i++) {
      if (arr[i].equals(value)) {
        System.out.println(value + " is at index " + i);
        return i;
      }
    }
    System.out.println("The values does not exist in this BT");
    return -1;
  }

  //Delete Method
  //Time O(n) / Space is O(1)
  public void delete(String value) {
    int location = search(value); //O(n)
    if (location == -1) {
      return;
    } else {
      arr[location] = arr[lastUsedIndex];
      lastUsedIndex--;
      System.out.println("The node successfully deleted");
    }
  }

  //Delete Binary Tree
  public void deleteBinaryTree() {
    try {
      arr = null;
      System.out.println("The binary tree was successfully deleted.");
    } catch (Exception e) {
      System.out.println(
        "There was an error deleted the binary tree: " + e.getMessage()
      );
    }
  }
}
