import java.util.Arrays;

public class RotateMatrix {

  boolean rotateMatrix(int[][] matrix) {
    //     // TODO
    //     /*
    //     1. Step 1 understand the problem
    //     input: 2d Array
    //     output: 2d Array rotated 90 degrees

    //     example input
    //     [[1,2,3],[4,5,6],[7,8,9],]
    //     output
    //     [[7,4,1],[8,5,2],[9,6,3]]

    //     input
    //     [[1,2],[3,4]]

    //     output
    //     [[3,1],[4,2]]

    //     simple example
    //     change -- How much we shift the elements by
    //         1: [0,0]--->[0,2] change [+0,+2]
    //         2: [0,1]--->[1,2] change [+1,+1]
    //         3: [0,2]--->[2,2] change [+2, +0]
    //         4: [1,0]--->[0,1] change [-1,+1]
    //         5: [1,1]--->[1,1] change [+0,+0]
    //         6: [1,2]--->[2,1] change [+1,-1]
    //         7: [2,0]--->[0,0] change [-2,+0]
    //         8: [2,1]--->[1,0] change [-1,-1]
    //         9: [2,2]--->[2,0] change [+0,-2]

    //         complex example?
    //         only integers, n/a?

    //         for condition to be true:
    //         We must shift each element in the array by the given Number

    //         for condition to be false i.e. failed case:
    //         each element is not shifted by the given number

    //     2. How would a human solve this?
    //     1. Get our 2d array
    //     2. locate a given element in our 2d array
    //     3. Shift the element to the desired location (Is there a formula that automatically does this that we can derive)

    //     2. How would a human solve this
    //     1.For loop: access the elements in our array in reverse column order
    //         1a. from the bottom of the column to the top
    //     2. Put the elements into a new array
    //     3. return true

    //     More involved steps
    //     1. Access elements via column order traversal nested loop
    //     2. Then do it backwards
    //     3. Then put it into our new array
    //     */
    //     return true;

    // }

    int[][] rotateMatrix = new int[matrix.length][matrix[0].length];
    int colLength = matrix[0].length;
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = matrix.length - 1; j >= 0; j--) {
        rotateMatrix[i][colLength - j - 1] = matrix[j][i];
      }
    }
    System.out.println(Arrays.deepToString(rotateMatrix));
    return true;
  }

  public static void main(String[] args) {
    RotateMatrix rm = new RotateMatrix();
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rm.rotateMatrix(matrix);
  }
}
