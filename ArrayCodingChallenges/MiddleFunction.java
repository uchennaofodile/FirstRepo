import java.util.Arrays;

public class MiddleFunction {

  static int[] middle(int[] arr) {
    // TODO
    int[] result = new int[arr.length - 2];
    for (int i = 0; i < result.length; i++) {
      if (i == 0) {
        result[i] = arr[i + 1];
        continue;
      }
      result[i] = arr[i + 1];
    }
    return result;
  }

  public static int[] middle2(int[] arr) {
    int result[] = new int[arr.length - 2];
    for (int i = 1; i < arr.length - 1; i++) {
      result[i - 1] = arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    //MiddleFunction mfFunction = new MiddleFunction();
    int[] array = { 1, 2, 3, 4 };

    var result = MiddleFunction.middle(array);

    System.out.println(Arrays.toString(result));
  }
}
