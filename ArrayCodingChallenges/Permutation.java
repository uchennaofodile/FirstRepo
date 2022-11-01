public class Permutation {

  //This method checks if an array is a permuation of another array and works for Strings and integers and other
  //primitive data types
  public boolean permutation(int[] array1, int[] array2) {
    // TODO
    /*
        1 -->Understand the problem
        input: two integer arrays
        output: boolean 
        
        simple eg
        input: {3,4,5},{4,3,5}
        output: true
        
        input: {3,4,1}{1,4,3}
        output: true
        
        input: {3,4,1}{3,4,6}
        output: false

        complex example
        input: {3,3,3,4,5,5}{3,4,5} //all have matches but the lengths are different
        output: false
        
        
        conditions needed for true: 
        same length
        all numbers must have a match

        The two conditions above must be satisfied to yield true
        
        arrays must contain the same numbers in the same frequency
        but the numbers do not have to be in the same order by defintion they will have the same length (maybe check for length first) return false
        
        conditions for false: 
        different length
        different numbers
        
        2--> How would a human solve this?
        a. Check the lengths of both sets and if they are different say no match
        1. get our first set of numbers and the
        2. Look at each number in the first set of numbers and look for a match in the other set of numbers
        
        3. Do this by comparing the two sets of numbers against each other
        4. We will begin with the first number from out first set of numbers
        and we will look for a match between the first  number from the first set of numbers and a number from our second set of numbers. 
       5. If a match is found add 1 to our matchCounter
       6. Compare the matchCounter with the length of the array1 and if they are equal say true
        7. else say false
        */

    int matchCounter = 0;
    /*a. Check the lengths of both sets and if they are different say no match*/
    if (array1.length != array2.length) {
      return false;
    }
    /* 1. get our first set of numbers*/
    for (int i = 0; i < array1.length; i++) {
      /*2. Get our second set of numbers and compare the set across each given number int the first*/
      for (int j = 0; j < array2.length; j++) {
        /*look for a match between the first  number from the first set of numbers and a number from our second set of numbers. 
        5. If a match is found add 1 to the match counter
    */
        if (array1[i] == array2[j]) {
          matchCounter++;
        }
      }
    }
    /*the total number of matches must correspond with the number of elements in the array */
    if (matchCounter == array1.length) {
      return true;
    }

    /*6. If there is no match and the lengths are equal say there is no match*/
    return false;
  }

  public static void main(String[] args) {
    Permutation p = new Permutation();
    int[] intArray1 = { 3, 4, 5 };
    int[] intArray2 = { 4, 3, 1 };
    var result = p.permutation(intArray1, intArray2);
    System.out.println(result);
  }
}
