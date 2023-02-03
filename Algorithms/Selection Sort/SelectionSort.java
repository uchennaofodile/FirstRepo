class SelectionSort {

  //Time is O(N^2)
  //Space is O(1)
  static void selectionSort(int[] a) {
    for (int j = 0; j < a.length; j++) {
      int minimumIndex = j;
      for (int i = j + 1; i < a.length; i++) {
        if (a[i] < a[minimumIndex]) {
          minimumIndex = i;
        }
      }
      if (minimumIndex != j) {
        int temp = a[j];
        a[j] = a[minimumIndex];
        a[minimumIndex] = temp;
      }
    }
  }

  static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
