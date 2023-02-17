class Main {

  public static void main(String[] args) {
    int arr[] = { 9, 7, 5, 4, 2, 1, 3, 6, 8 };
    BucketSort bs = new BucketSort(arr);
    System.out.println();
    bs.printArray();
    bs.bucketSort();
    System.out.println();
    System.out.println("--------Sorted-----------");
    bs.printArray();
  }
}
