/**
 * Main
 */

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // Step 1 - Declare
    int[][] int2DArray; //o(1)

    String[][] s2DArray = { //O(1) more efficient to declare a 2d array this way
      { "a", "b" },
      { "c", "d" },
    };

    // Step 2 - Instantiate
    int2DArray = new int[2][2]; //O(1)

    // Step 3 - Initialize
    int2DArray[0][0] = 1; //All O(1) but when combine we get O(mn) m= rows, n = columns
    int2DArray[0][1] = 2;
    int2DArray[1][0] = 3;
    int2DArray[1][1] = 4;
    //Space complexity is also O(mn) because it we are allocating mn space in the memory

    //TwoDimensionArray twoDimensionArray = new TwoDimensionArray();
    //     System.out.println(Arrays.deepToString(int2DArray));
    //     System.out.println(Arrays.deepToString(s2DArray));
    //     System.out.println(int2DArray.length);

    TwoDimensionArray tArray = new TwoDimensionArray(3, 4);
    System.out.println("Inserting Values");
    tArray.insertValueInTheArray(0, 3, 20);
    tArray.insertValueInTheArray(0, 0, 45);
    // tArray.insertValueInTheArray(0, 9, 45);
    // System.out.println(Arrays.deepToString(tArray.arr));

    System.out.println("Accessing Values");

    tArray.accessValueInTheArray(0, 0);
    tArray.accessValueInTheArray(0, 3);
    tArray.accessValueInTheArray(0, 12213);

    System.out.println("2D Array Traversal");

    tArray.traverse2DArray();
    System.out.println("2D Search");
    tArray.searchingValueIn2DArray(20);

    System.out.println("Delete an element");
    tArray.deleteValueIn2DArray(0, 0);
    tArray.deleteValueIn2DArray(0, 0);
    tArray.deleteValueIn2DArray(0, 2323);
    System.out.println(Arrays.deepToString(tArray.arr));
  }
}
