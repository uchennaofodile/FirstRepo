public class PermutationAlternate {

  //This method checks if an array is a permuation of another array and only works for integers
  public boolean permutation(int[] intArray1, int[] intArray2) {
    if (intArray1.length != intArray2.length) {
      return false;
    }

    int sum1 = 0;
    int sum2 = 0;
    int product1 = 1;
    int product2 = 1;

    for (int i = 0; i < intArray1.length; i++) {
      sum1 += intArray1[i];
      sum2 += intArray2[i];
      product1 *= intArray1[i];
      product2 *= intArray2[i];
    }

    if (sum1 == sum2 && product1 == product2) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] intArray1 = { 1, 2, 3 };
    int[] intArray2 = { 1, 2, 6 };
    PermutationAlternate pa = new PermutationAlternate();
    var result = pa.permutation(intArray1, intArray2);
    System.out.println(result);
  }
}
