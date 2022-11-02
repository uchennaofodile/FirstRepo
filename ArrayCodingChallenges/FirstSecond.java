public class FirstSecond {

  static String firstSecond(Integer[] myArray) {
    int firstHighest = 0;
    int secondHighest2 = 0;

    /*
        input array of int
        output string of two highest scores
        
        eg input 1,2,4,10
        output 10 4
        
        2. human flex
        1. get all available numbers and then 
        find the greatest number and save it highest1
        2. Go through all the numbers again and find the number with the lowest difference between the greatest number and the lowest number in the array
        Alternative. sort the array and get the last two numbers?
        
        
        */

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > firstHighest) {
        firstHighest = myArray[i];
      }
    }

    int comparison = firstHighest - myArray[0];
    for (int j = 0; j < myArray.length; j++) {
      if (myArray[j] == firstHighest) {
        continue;
      }
      if (firstHighest - myArray[j] < comparison) {
        secondHighest2 = myArray[j];
        comparison = firstHighest - myArray[j];
      }
    }
    return firstHighest + " " + secondHighest2;
  }

  static String firstSecondInstructor(Integer[] myArray) {
    Integer[] arr = myArray;
    Arrays.sort(arr, Collections.reverseOrder());
    int first = arr[0];
    Integer second = null;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != first) {
        second = arr[i];
        break;
      }
    }
    return first + " " + second;
  }

  public static void main(String[] args) {}
}
