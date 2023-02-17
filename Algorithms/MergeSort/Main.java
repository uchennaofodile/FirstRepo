public class Main {

  public static void main(String[] args) {
    int[] arr = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };
    MergeSort.mergeSort(arr, 0, arr.length - 1);
    MergeSort.printArray(arr);
  }
}
