class HeapSort {
  int[] arr;

  public HeapSort(int[] arr) {
    this.arr = arr;
  }

  public void sort() {
    BinaryHeap bh = new BinaryHeap(arr.length);
    for (int i = 0; i < arr.length; i++) {
      bh.insertInHeap(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = bh.extractHeadOfHeap();
    }
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
