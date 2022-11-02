public class SumDiagonal {

  public int sumDiagonal(int[][] a) {
    int sum = 0;
    System.out.print("The sum of: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < i + 1; j++) {
        if (j == 2) {
          System.out.print(a[i][j]);
        } else {
          System.out.print(a[i][j] + " + ");
        }

        sum += a[i][j];
      }
    }
    System.out.print(" = " + sum);
    return sum;
  }

  public int sumDiagonal2(int[][] a) {
    int sum = 0;
    System.out.print("The sum of: ");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i][i] + " + ");

      sum += a[i][i];
    }
    System.out.print(" = " + sum);
    return sum;
  }

  public static void main(String[] args) {
    SumDiagonal sd = new SumDiagonal();
    int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    var result = sd.sumDiagonal2(array);
  }
}
