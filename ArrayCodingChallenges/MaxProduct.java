/**
 * MaxProuduct
 */

//This method takes an integer array as an input and returns a string output of the two greatest numbers
//This method checks which two numbers would make the greatest sum
public class MaxProduct {
  public int[] intArray = { 234, 4, 5, 6, 77, 88, 99 };

  public String maxProuduct(int[] intArray) { // TODO
    //input inter array - using numbers from the array
    //output two numbers from the array
    //example maxProduct(5,6,7) ---> (5, 7)
    //edge cases
    //complex example - edge case what if the input s not an integer array
    //return an error message
    //no inputs return undefined
    //defensive code and think about how your code could defend against errors
    //psedocode - how would you solve it as a human
    //Step 1 -figure out which number is the greatest
    //store it somewhere to be returned later
    //Step 2 - create a new array from the given array input
    //Step 3 - Set the value of the greatest in the new array to zero
    //Step 4 - figure out the second greatest number and store it
    // Step 5 - return both numbers

    int greatest1 = 0;
    int greatest2 = 0;
    int[] intArray2 = new int[2];
    int[] intArray3 = new int[intArray.length];

    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] > greatest1) {
        greatest1 = intArray[i];
        intArray2[0] = greatest1;
      }
      intArray3[i] = intArray[i];
    }

    for (int k = 0; k < intArray3.length; k++) {
      if (intArray3[k] == greatest1) {
        intArray3[k] = 0;
      }
    }

    for (int j = 0; j < intArray3.length; j++) {
      if (intArray3[j] > greatest2) {
        greatest2 = intArray[j];
        intArray2[1] = greatest2;
      }
    }

    return greatest1 + "," + greatest2;
  }

  public static void main(String[] args) {
    MaxProuduct mp = new MaxProuduct();
    System.out.println(mp.maxProuduct(mp.intArray));
  }
}
