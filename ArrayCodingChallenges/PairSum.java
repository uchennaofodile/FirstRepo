public class PairSum {

  public static String pairSum(int[] myArray, int sum) {
    // TODO
    String pairs = "";
    //pairs+= myArray[]+":" + myArray[] + " ";

    for (int i = 0; i < myArray.length - 1; i++) {
      for (int j = 1 + i; j < myArray.length; j++) {
        if (myArray[i] + myArray[j] == sum) {
          pairs += myArray[i] + ":" + myArray[j] + " ";
        }
      }
    }
    System.out.println(pairs);
    return pairs;
  }

  public static void main(String[] args) {
    PairSum p = new PairSum();
    int[] array = { 1, 2, 5, 0, 3, 8, 4, -3, 5, 6 };
    PairSum.pairSum(array, 6);
  }
}
