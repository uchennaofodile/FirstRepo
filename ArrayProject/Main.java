/**
 * Main
 */
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How many days' temperature? ");
    int numDays = console.nextInt();
    int[] temps = new int[numDays];
    int daysAboveAverage = 0;
    //record temperatures and find average
    int sum = 0;
    for (int i = 0; i < numDays; i++) {
      System.out.println("Day " + (i + 1) + "'s high temp: ");
      temps[i] = console.nextInt();
      sum += temps[i];
    }
    double average = sum / numDays;
    //Count days above average
    for (int j = 0; j < temps.length; j++) {
      if (temps[j] > average) {
        daysAboveAverage++;
      }
    }
    System.out.println();
    System.out.println("Average Temp = " + average);
    System.out.println(daysAboveAverage + " day(s) above average.");
  }
}
