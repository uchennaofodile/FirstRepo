import java.util.Arrays;

public class ReverseOrder {

  public int[] reverseOrder(int[] array) {
    int temp = 0;
    int distance = array.length;
    for (int i = 0; i < distance / 2; i++) {
      temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4 };
    int[] array2 = { 1, 2, 3, 4, 5 };

    ReverseOrder rOrder = new ReverseOrder();

    var result = rOrder.reverseOrder(array2);
    System.out.println(Arrays.toString(result));
  }
}
