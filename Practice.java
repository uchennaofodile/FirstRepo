import java.util.Arrays;

/**
 * practice
 */
public class Practice {

   int[] numArray = {1,2,3,4,5,6};   
   public String[] stringArray = {"1","2","3","4","5","6"};   

public void sumAndProduct(int [] arr){
int sum = 0;
int product = 1;
    for(int i = 0; i < numArray.length; i++){
        sum += numArray[i];
        product  *= numArray[i];
    }
System.out.println("The sum is: " + sum);
System.out.println("The product is: " + product);
}

public void printPairs(String [] arr) {
    for (int k = 0; k < arr.length; k++) { //O(N)
        for (int k2 = 0; k2 < arr.length; k2++) { //O(N)
             System.out.println(stringArray[k] + stringArray[k2]); //O(1)
        }
    }
   
}//O(N^2) because for each instance of k we do k2 so we multiply K*K = Ksquared

public void reverseArray(int [] arr) {
    for (int j = arr.length-1; j >= 0; j--) {
        System.out.print(arr[j]);
    }
    
}
public void reverseArrayToNewArray(int [] array) {
    for (int j = 0; j < array.length/2 ; j ++) { ///-->O(N/2)--->O(N)
       int other = array.length-j-1; //O(1)
       int temp = array[j]; //O(1)
       array[j] = array[other]; //O(1)
       array[other] = temp; //O(1)
    } 
    System.out.println(Arrays.toString(array)); //O(1)
    
}

public static void main(String[] args) { 
    Practice demo = new Practice();
    
int[] arr = {1,2,3};
String [] stringArray = {"we"};

    //demo.sumAndProduct(demo.numArray);
    //demo.printPairs(demo.stringArray);
    //demo.reverseArray(demo.numArray);
    demo.reverseArrayToNewArray(demo.numArray);
    //System.out.println("The array is: " + Arrays.toString(demo.numArray));
    
}

}