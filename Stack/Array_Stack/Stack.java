class Stack {
  int[] arr;
  int topOfStack;

  //Stack Constructor
  //Time will be O(1) / Space O(N)
  //N is the number of cells contiguously assigned
  Stack(int size) {
    this.arr = new int[size];
    this.topOfStack = -1; //Nothing in yet
    System.out.println("The stack is created with the size of: " + size);
  }

  //Time and Space is O(1)
  //isEmpty
  public boolean isEmpty() {
    if (topOfStack == -1) {
      return true;
    } else {
      return false;
    }
  }

  //isFull
  //Time and Space is O(1)
  public boolean isFull() {
    if (topOfStack == arr.length - 1) {
      return true;
    } else {
      return false;
    }
  }

  //Push
  //Time O(1) / Space O(1) just updating the values of the array
  public void push(int value) {
    if (isFull()) {
      System.out.println("The Stack is full!");
    } else {
      arr[topOfStack + 1] = value;
      topOfStack++;
      System.out.println("Successfully inserted the value: " + value);
    }
  }

  //Pop
  //Time O(1) / Space O(1)
  public int pop() {
    if (isEmpty()) {
      System.out.println("The Stack is empty!");
      return -1;
    } else {
      int topStack = arr[topOfStack];
      topOfStack--;
      return topStack;
    }
  }

  //Peek
  //Space and time is O(1)
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Stack is empty!");
      return -1;
    } else {
      return arr[topOfStack];
    }
  }

  //Delete
  public void deleteStack() {
    arr = null;
    System.out.println("The stack is successfully deleted!");
  }
}
