class BinaryHeap {
  int arr[];
  int sizeOfTree;

  //Time is O(1)
  //Space is O(n)
  //Creation
  public BinaryHeap(int size) {
    arr = new int[size];
    this.sizeOfTree = 0;
    System.out.println("New Binary Heap created");
  }

  //isEmpty
  boolean isEmpty() {
    if (sizeOfTree == 0) {
      return true;
    } else {
      return false;
    }
  }

  //peek
  //space and time is O(1)
  Integer peek() {
    if (isEmpty()) {
      System.out.println("The Binary Heap is empty");
      return null;
    } else {
      return arr[1];
    }
  }

  //time and space is O(1)
  int sizeOfBinaryHeap() {
    return sizeOfTree;
  }

  //traversal
  //time O(n)
  //space is O(1)
  //level order
  void levelOrder() {
    for (int i = 1; i <= sizeOfTree; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
  }

  //Heapify for insert
  //heapfiyBottomToTop
  //time and space is O(Log N)
  void heapifyBottomToTop(int index, String heapType) {
    int parent = index / 2;
    if (index <= 1) {
      return;
    }
    if (heapType.equals("Min")) {
      if (arr[index] < arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    } else if (heapType.equals("Max")) {
      if (arr[index] > arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    }
    heapifyBottomToTop(parent, heapType); //----->O(Log N)
  }

  //insertion
  void insert(int value, String typeHeap) {
    arr[sizeOfTree + 1] = value;
    sizeOfTree++;
    heapifyBottomToTop(sizeOfTree, typeHeap);
    System.out.println("Inserted " + value + " into Binary Heap");
  }

  //heapify

  //Time and space O(log n)
  public void heapifyTopToBottom(int index, String heapType) {
    int left = index * 2;
    int right = index * 2 + 1;
    int swapChild = 0;
    if (sizeOfTree < left) {
      return;
    }
    if (heapType == "Max") {
      if (sizeOfTree == left) {
        if (arr[index] < arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left] > arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] < arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    } else if (heapType == "Min") {
      if (sizeOfTree == left) {
        if (arr[index] > arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left] < arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] > arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    }
    heapifyTopToBottom(swapChild, heapType);
  }

  //   extract a node
  //Time and space O(log n)
  int extractHeadOfBP(String heapType) {
    if (isEmpty()) {
      return -1;
    } else {
      int extractedValue = arr[1];
      arr[1] = arr[sizeOfTree];
      sizeOfTree--;
      heapifyTopToBottom(1, heapType);
      return extractedValue;
    }
  }

  //delete binary heap
  //time and space deleted
  void delete() {
    arr = null;
    System.out.println("Binary Heap successfully deleted");
  }
}
