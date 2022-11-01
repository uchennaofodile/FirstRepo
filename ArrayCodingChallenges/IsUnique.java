public class IsUnique {

  public boolean isUnique(int[] intArray) {
    // TODO
    //Step 1 - understand the problem
    /*
        input: integer array 
        output: boolean true/false
        
        simple example
        eg. input: {1,3,5,6} output: true
            input: {1,2,2,5} output: false
            
        complex example
        
        input: {-1,4,5,0.5,1/2} output: decimals not aloud int array
        would throw an error
        by definition values are only integers so forget about decimals
        
        Step 2 - How would a human solve this?
        
        1. Get our numbers
        2. Check if a given number equals another value in the array for 
        each number
        eg input {1,2,3,4,5}
        check 1 for each other value --> 2,3,4,5
        Then check 2 for each other value ---> 3,4,5
        Then check 3 for each other value ---> 4,5
        Then check 4 for each other value ---> 5
        3. Do this until we go threw all the numbers
        4. If a number equals another value in the say false
        5. Conversely, say true
        6. Profit?
        
        3. Write the Code
        */

    //1. Get our numbers
    for (int i = 0; i < intArray.length; i++) {
      /*  2. Check if a given number equals another value in the array for 
        each number*/
      for (int j = i + 1; j < intArray.length; j++) {
        /*  4. If a number equals another value in the say false
        5. Conversely, say true* and save your answer to be returned later*/

        if (intArray[i] == intArray[j]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    IsUnique is = new IsUnique();
    int[] intArray = { 1, 2, 3, 4, 4, 5 };
    System.out.println(is.isUnique(intArray));
  }
}
