class Main {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 7, 9, 3, 6, 3, 5, 9, 6, 7 };
    HeapSort hp = new HeapSort(arr);
    hp.sort();
    HeapSort.printArray(arr);
  }
}
