/**
 * FindAMissingNumber
 */
public class FindAMissingNumber {
  int intArray[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

  public void missingNumber(int[] intArray) {
    // TODO
    for (int i = 0; i < (intArray.length); i++) {
      //Preventing IndexOutOfBoundsException
      if (i == 0) {
        continue;
      }
      //Checking for missing value
      if ((intArray[i] - intArray[i - 1]) == 2) {
        System.out.println((intArray[i]) - 1);
        break;
      }
    }
  }

  public static void main(String[] args) {
    FindAMissingNumber main = new FindAMissingNumber();
    main.missingNumber(main.intArray);
  }
}
