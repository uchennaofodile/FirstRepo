class QuickSort {

  //Time O(n)
  //Space O(1) no extra memerory required
  static int partition(int[] array, int start, int end) {
    int pivot = end; //O(1)
    int i = start - 1; //O(1)
    for (int j = start; j <= end; j++) { //O(n)
      if (array[j] <= array[pivot]) { //O(1)
        i++; //O(1)
        int temp = array[i]; //O(1)
        array[i] = array[j]; //O(1)
        array[j] = temp; //O(1)
      }
    }
    return i; //O(1)
  }

  //Time O(NLogN)
  //Space is O(N) --> Stack Memory recursion
  public static void quickSort(int[] array, int start, int end) { //T(N)
    if (start < end) {
      int pivot = partition(array, start, end); //O(N)
      quickSort(array, start, pivot - 1); //T(N/2)
      quickSort(array, pivot + 1, end); //T(N/2)
    }
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
