import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        System.out.println(Arrays.toString(sda.arr));
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(1, 30);
        sda.insert(12, 120);
        
//         var firstElement = sda.arr[0];
// System.out.println("Printing Elements");
//System.out.println("_______________");
        // System.out.println("Printing the first element: " + firstElement); //O(1)
        // var secondElement = sda.arr[1];
        // System.out.println("Printing the second element: " + secondElement); //O(1)


        // try { var thirdElement = sda.arr[20];
        //     System.out.println("Printing the 20th element: " + thirdElement);
            
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     // TODO: handle exception
        //     System.err.println("Error: " + e.getMessage());
        // }

// System.out.println("Array traversal");
// //System.out.println("_______________");
// sda.traverseArray();

// System.out.println("Search Int Array");
// sda.searchIntArray(50);

System.out.println("Delete Value");
sda.deleteValue(121);
System.out.println(sda.arr[0]);
    }
}