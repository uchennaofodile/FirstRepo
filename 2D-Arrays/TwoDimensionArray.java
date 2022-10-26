/**
 * TwoDimensionArray
 */
public class TwoDimensionArray {
  // Step 1 - Declaration
  int[][] arr = null;

  public TwoDimensionArray(int numRows, int numCols) {
    //Step 2 - Instantiation
    this.arr = new int[numRows][numCols];

    //Step 3 - Initialize
    for (int i = 0; i < arr.length; i++) { //get all the rows
      for (int j = 0; j < arr[0].length; j++) { //get all the columns for each row
        arr[i][j] = Integer.MIN_VALUE;
      }
    }
  }

  // Inserting value in the Array

  public void insertValueInTheArray(/*space and time O(1) because we are just inserting 1 
  elemnet to a cell and are not creating anything new in the memory*/
    int indexOfRow, //O(1)
    int indexOfColumn, //O(1)
    int valueToInsert //O(1)
  ) {
    try {
      if (arr[indexOfRow][indexOfColumn] == Integer.MIN_VALUE) { //O(1)
        arr[indexOfRow][indexOfColumn] = valueToInsert; //O(1)
        System.out.println(valueToInsert + " has been successfully inserted!"); //O(1)
      } else {
        System.out.println( //O(1)
          "The cell at the row " +
          indexOfRow +
          ", column " +
          indexOfColumn +
          " is already occupied!"
        );
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.err.println( //O(1)
        "Invalid index for 2-D Array! ====> " + e.getMessage()
      );
    }
  }

  // Accessing a value in the array

  public int accessValueInTheArray(int row, int column) {
    try {
      // Step 1 - Check if a value exists
      if (arr[row][column] != Integer.MIN_VALUE) {
        System.out.println(
          "\nChecking if a value exists in Row: " +
          row +
          ", Column: " +
          column +
          "..."
        );
        System.out.println(
          "Hooray! The value " + arr[row][column] + " has been found."
        );
        return arr[row][column];
      } else {
        System.out.println(
          "\nChecking if a value exists in Row: " +
          row +
          ", Column: " +
          column +
          "..."
        );
        System.out.println("Sorry, the cell is empty!");
        return Integer.MIN_VALUE;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.out.println(
        "\nChecking if a value exists in Row: " +
        row +
        ", Column: " +
        column +
        "..."
      );
      System.err.println(
        "Whoops! The inputted index is invalid for the 2-D Array! ====> " +
        e.getMessage()
      );
      return -1;
    }
  }
}
