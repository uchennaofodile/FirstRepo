import java.util.Arrays;

public class SingleDimensionArray {
  int arr[] = null;

  public SingleDimensionArray(int sizeOfArray) {
    System.out.println(Arrays.toString(arr));
    arr = new int[sizeOfArray];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.MIN_VALUE;
    }
  }

  public void insert(int location, int valueToBeInserted) {
    try {
      if (arr[location] == Integer.MIN_VALUE) { //O(1)
        arr[location] = valueToBeInserted; //O(1)
        System.out.println("Successfully inserted: " + valueToBeInserted); //O(1)
      } else {
        System.out.println("This cell is already occupied"); //O(1)
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.err.println("Invalid index to access array: " + e.getMessage()); //O(1)
    }
  }

  //Array Traversal
  // time and space complexity is O(1) because
  // extra memory is not allocated to traverse the array
  public void traverseArray() {
    try {
      for (int i = 0; i < arr.length; i++) { //-----O(N)
        System.out.print(arr[i] + " "); //----O(1)
      }
      System.out.println();
    } catch (Exception e) {
      // TODO: handle exception
      System.err.println("Array does not exist!"); //----O(1)
    }
  }

  //Linear Search
  public void searchIntArray(int valueToSearch) { //time complexity O(N), space complexity O(1) --> bc extra mem
    //is not needed to search the array
    try {
      for (int i = 0; i < arr.length; i++) { //O(N)
        if (arr[i] == valueToSearch) { //O(1)
          System.out.println(
            "The value is found at the index of " +
            i +
            " and the value is " +
            arr[i] +
            "."
          ); //O(1)
          return;
        }
      }
      System.out.println(valueToSearch + " not found!"); //O(1)
    } catch (Exception e) {
      // TODO: handle exception
      System.err.println("Array not found!");
    }
  }

  public void deleteValue(int valueToDelete) { //time complexity and space
    //complexity are both o(1) b/c new memory is not needed to run the fxn
    try {
      arr[valueToDelete] = Integer.MIN_VALUE; //O(1)
      System.out.println("The value has been deleted succesfully."); //O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.err.println(
        "The value that is provided is not in the range of the array.: " +
        e.getMessage()
      ); //O(1)
    }
  }
}
