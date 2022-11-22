public class CircularQueue {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;

  //Time O(1) SpaceO(N)
  public CircularQueue(int size) {
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println(
      "The CQ is successfully created with the size of " + size
    );
  }

  //isEmpty
  //Time and Space is O(1)
  public boolean isEmpty() {
    if (topOfQueue == -1) {
      return true;
    } else {
      return false;
    }
  }

  //isFull
  //Time and Space is O(1)
  public boolean isFull() {
    if (topOfQueue + 1 == beginningOfQueue) {
      return true;
    } else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
      return true;
    } else {
      return false;
    }
  }

  //enQueue
  //Time and Space is O(1)
  public void enQueue(int value) {
    if (isFull()) {
      throw new IllegalStateException("The Queue is full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " in the queue");
    } else {
      //identify the topOfQueue
      if (topOfQueue + 1 == size) {
        topOfQueue = 0;
        /*for (int i = 0; i<size; i++){
            if(arr[i] == null){
                arr[i] = value;
            }
        } */
      } else {
        topOfQueue++;
      }
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted " + value + " in the queue.");
    }
  }

  //deQueue
  public int deQueue() {
    if (isEmpty()) {
      System.out.println("The CQ is empty!");
      return -1;
    } else {
      int result = arr[beginningOfQueue];
      arr[beginningOfQueue] = 0;
      if (beginningOfQueue == topOfQueue) {
        beginningOfQueue = topOfQueue - 1;
      } else if (beginningOfQueue + 1 == size) {
        beginningOfQueue = 0;
      } else {
        beginningOfQueue++;
      }
      return result;
    }
  }
}
