class BubbleSort {

  //Time O(N)^2
  //Space O(1)
  void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) { //O(N)
      for (int j = 0; j < n - i - 1; j++) { //O(N) -----O(N)^2
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
