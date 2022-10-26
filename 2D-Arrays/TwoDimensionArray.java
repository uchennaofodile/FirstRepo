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

  //Traverse 2D Array
  //time O(mn) space is o(1) because no additional space is needed
  public void traverse2DArray() {
    for (int i = 0; i < arr.length; i++) { //O(m)
      for (int j = 0; j < arr[0].length; j++) { //O(n)---->O(m*n)
        System.out.print(arr[i][j] + " "); //O(1)
      }
      System.out.println(); //O(1)
    }
  }

  //Searching 2D Array --> Linear Search: checks every element -->O(mn) -> space is o(1)
  public void searchingValueIn2DArray(int valueToSearch) {
    for (int i = 0; i < arr.length; i++) { //O(m)
      for (int j = 0; j < arr[0].length; j++) { //O(n)
        if (arr[i][j] == valueToSearch) { //O(1)
          System.out.println( //O(1)
            "\nChecking if the value " +
            valueToSearch +
            " exists in the array..."
          );
          System.out.println( //o(1)
            "Hooray! The value has been found at [" +
            i +
            "]" +
            "[" +
            j +
            "]" +
            "."
          );
          return;
        }
      }
    }
    System.out.println("Whoops! The value does not exist in the array!"); //o(1)
  }

  //Deleting an element in the array space and time is o(1)
  public void deleteValueIn2DArray(int row, int col) {
    try {
      if (arr[row][col] != Integer.MIN_VALUE) { //O(1)
        System.out.println("Hooray! Successfully deleted " + arr[row][col]); //o(1)
        arr[row][col] = Integer.MIN_VALUE; //o(1)
      } else {
        System.out.println("The cell is already empty!"); //o(1)
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.err.println(
        "The inputted index is invalid for the 2D Array ===> " + e.getMessage() //o(1)
      );
    }
  }
}
