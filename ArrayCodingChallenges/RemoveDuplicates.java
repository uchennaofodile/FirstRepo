import java.util.Arrays;

public class RemoveDuplicates {

  public static int[] removeDuplicatesAlt(int[] arr) { //needs revision
    //   TODO
    int duplicateCounter = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        duplicateCounter++;
      }
    }
    int[] myArrayAnswer = new int[arr.length - duplicateCounter];

    myArrayAnswer[0] = arr[0];
    myArrayAnswer[myArrayAnswer.length - 1] = arr[arr.length - 1];

    for (int j = 1; j < myArrayAnswer.length - 1; j++) {
      int previousArr = arr[j - 1];
      int nextArr = arr[j + 1];

      if (arr[j] == nextArr) {
        myArrayAnswer[j] = arr[j + 2];
        System.out.println(
          "a " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
        );
        continue;
      }

      if (arr[j] != myArrayAnswer[j - 1] && myArrayAnswer[j - 2] == arr[j]) {
        myArrayAnswer[j] = arr[j + 2];
        System.out.println(
          "b " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
        );
      }
      if (arr[j] != previousArr) {
        myArrayAnswer[j] = arr[j];
        System.out.println(
          "c " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
        );
      }
      if (arr[j] == previousArr && myArrayAnswer[j - 1] == nextArr) {
        myArrayAnswer[j] = arr[j + 2];
        System.out.println(
          "d " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
        );
        continue;
      }
      if (arr[j] == previousArr) {
        myArrayAnswer[j] = nextArr;
        System.out.println(
          "e " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
        );
        continue;
      }

      myArrayAnswer[j] = arr[j];
      System.out.println(
        "f " + "j is: " + j + " myArrayAnswer is: " + myArrayAnswer[j]
      );
    }

    System.out.println(Arrays.toString(myArrayAnswer));
    return myArrayAnswer;
  }

  private static int removeDuplicates(int a[], int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int j = 0;

    for (int i = 0; i < n - 1; i++) {
      if (a[i] != a[i + 1]) {
        a[j++] = a[i];
      }
    }

    a[j++] = a[n - 1];

    return j;
  }

  public static int[] removeDuplicates(int[] arr) {
    int result = removeDuplicates(arr, arr.length);

    int[] newArray = new int[result];

    for (int i = 0; i < result; i++) {
      newArray[i] = arr[i];
    }

    return newArray;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 12 };
    RemoveDuplicates.removeDuplicates(array);
  }
}
