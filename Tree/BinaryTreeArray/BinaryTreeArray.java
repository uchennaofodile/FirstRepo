public class BinaryTreeArray {
  String[] arr;
  int lastUsedIndex;

  public BinaryTreeArray(int size) {
    arr = new String[size];
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
}
