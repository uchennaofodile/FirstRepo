public class MissingNumber {
  int intArray[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

  public void missingNumber(int[] intArray) {
    // TODO
    for (int i = 0; i < (intArray.length); i++) {
      if (i == 0) {
        continue;
      }

      if ((intArray[i] - intArray[i - 1]) == 2) {
        System.out.println("The missing number is " + ((intArray[i]) - 1 + "."));
        return;
      }
    }
  }

  public static void main(String[] args) {
    MissingNumber main = new MissingNumber();
    main.missingNumber(main.intArray);
  }
}
