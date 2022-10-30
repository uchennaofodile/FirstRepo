import java.util.Arrays;

//This method takes an integer array as an input and finds the two numbers that will equal the target
//It returns the position of the elements in the array

public class TwoSum {
  int[] array = { 4, 2, 5, 2, 9, 3 };

  public int[] twoSum(int[] nums, int target) {
    // TODO

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          int[] answer = { i, j }; //return new int [i,j];
          System.out.println(Arrays.toString(answer));
          return answer;
        }
      }
    }
    throw new IllegalArgumentException("No solution found!");
  }

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();
    ts.twoSum(ts.array, 7);
  }
}
