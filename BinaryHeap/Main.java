/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    System.out.println();
    BinaryHeap bHeap = new BinaryHeap(5);
    bHeap.insert(10, "Min");
    bHeap.insert(5, "Min");
    bHeap.insert(15, "Min");
    bHeap.insert(1, "Min");
    bHeap.levelOrder();
    bHeap.extractHeadOfBP("Min");
    bHeap.levelOrder();
  }
}
