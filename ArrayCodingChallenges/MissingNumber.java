public class MissingNumber {
  int intArray[] = { 1, 3, 4, 5, 6, 7, 8, 9 };

  public void missingNumber(int[] intArray) {
    // TODO
    for (int i = 1; i < (intArray.length); i++) {
      if ((intArray[i] - intArray[i - 1]) == 2) {
        System.out.println(
          "The missing number is " + ((intArray[i]) - 1 + ".")
        );
        return;
      }
    }
  }

  static int missingNumber2(int[] arr, int totalCount) {
    // TODO
    for (int j = 1; j < arr.length; j++) if (arr[j] - arr[j - 1] == 2) {
      totalCount = arr[j] - 1;
    }

    return totalCount;
  }

  static int missingNumber3(int[] arr, int totalCount) {
    int expectedSum = 0;
    int actualSum = 0;
    for (int i = 1; i <= totalCount; ++i) {
      expectedSum += i;
    }
    for (int i = 0; i < arr.length; i++) {
      actualSum += arr[i];
    }
    System.out.println(expectedSum); // 5

    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    MissingNumber main = new MissingNumber();
    main.missingNumber(main.intArray);
  }
}
