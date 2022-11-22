public class QueueArray {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;

  //Time O(1) / Space O(n) because the size depends on the given size
  public QueueArray(int size) {
    this.arr = new int[size];
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println(
      "The Queue is successfully created with the size of: " + size
    );
  }

  //isFull
  //Time and Space os O(1)
  public boolean isFull() {
    if (topOfQueue == arr.length - 1) {
      return true;
    } else {
      return false;
    }
  }

  //isEmpty
  //Time and Space is O(1)
  public boolean isEmpty() {
    if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
      return true;
    } else {
      return false;
    }
  }

  //enQueue
  //Time and Space is O(1)
  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The Queue is full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " into queue.");
    } else {
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " into queue.");
    }
  }

  // deQueue
  //Time and Space is O(1)
  public int deQueue() {
    if (isEmpty()) {
      System.out.println("The Queue is empty!");
      return -1;
    } else {
      int result = arr[beginningOfQueue];
      beginningOfQueue++;
      if (beginningOfQueue > topOfQueue) {
        beginningOfQueue = topOfQueue = -1; //empty Queue
      }
      return result;
    }
  }

  //peek
  //Time and Space = O(1)
  public int peek() {
    if (!isEmpty()) {
      return arr[beginningOfQueue];
    } else {
      System.out.println("The Queue is empty!");
      return -1;
    }
  }

  //delete
  //Time and space is O(1)
  public void deleteQueue() {
    arr = null;
    System.out.println("The Queue is successfully deleted!");
  }
}
