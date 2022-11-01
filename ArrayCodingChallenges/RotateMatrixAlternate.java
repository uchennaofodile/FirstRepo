import java.util.Arrays;

public class RotateMatrixAlternate {

  public boolean rotateMatrix(int[][] matrix) {
    if (matrix.length != matrix[0].length || matrix.length == 0) {
      return false;
    }

    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i];
        matrix[first][i] = matrix[last - offset][first];
        matrix[last - offset][first] = matrix[last][last - offset];
        matrix[last][last - offset] = matrix[i][last];
        matrix[i][last] = top;
      }
    }
    return true;
  }

  public void rotated(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - i - 1; j++) {
        //1. Save the top
        int top = matrix[i][j];
        //2. Move left to top
        matrix[i][j] = matrix[n - 1 - j][i];
        //3. Move bottom to left
        matrix[n - 1 - j][i] = matrix[n - i - 1][n - 1 - j];
        //4. Move right to bottom
        matrix[n - i - 1][n - 1 - j] = matrix[j][n - i - 1];
        //5. Move top to right
        matrix[j][n - i - 1] = top;
      }
    }
  }

  public static void main(String[] args) {
    RotateMatrixAlternate rm = new RotateMatrixAlternate();

    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rm.rotated(matrix);
    //rm.rotateMatrix(matrix);
    System.out.println(Arrays.deepToString(matrix));
  }
}
