/*
 * Describe how you could use a single Array to implement three stacks.
 */

public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  //private int[] values;
  //private int[] sizes;
  private int[] arr;
  private int topOfStack;

  //Constructor
  public ThreeInOne(int stackSize) {
    // TODO
    stackCapacity = stackSize * numberOfStacks;
    arr = new int[stackCapacity];
    // for (int i = 0; i < arr.length; i++) {
    //   if (i < 3) {
    //     values[i] = arr[i];
    //   } else if (i > 3 && i < 6) {
    //     values[i] = arr[i];
    //   } else if (i >= 7) {
    //     values[i] = arr[i];
    //   }
    // }
    topOfStack = -1;
    System.out.println("Stack successffully created.");
  }

  // isFull
  public boolean isFull(int stackNum) {
    //Input param - stackNum and checks if it is full
    //output t or f
    //access the desired stack based
    //check whether it is full
    //return t or false
    // TODO
    boolean value = false;
    if (isEmpty(stackNum)) {
      System.out.println("The Stack is empty!");
    } else {
      if (stackNum == 1) {
        if (topOfStack == stackCapacity * (1 / 3) - 1) {
          value = true; //2
        }
      } else if (stackNum == 2) {
        if (topOfStack == stackCapacity * (2 / 3) - 1) {
          value = true; //5
        }
      } else if (stackNum == 3) {
        if (topOfStack == stackCapacity - 1) {
          value = true; //8
        }
      }
    }
    return value;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
    // TODO

    boolean value = false;
    if (stackNum != 0) {
      if (topOfStack == -1) {
        value = true;
      }
    }
    return value;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    // TODO

    for (int i = 0; i < arr.length; i++) {
      if (i == stackCapacity * (1 / 3) - 1) {
        topOfStack = i; //2
      } else if (i == stackCapacity * (2 / 3) - 1) {
        topOfStack = i; //5
      } else if (i == stackCapacity - 1) {
        topOfStack = i; //8
      }
    }
    if (stackNum == 1) {
      return topOfStack;
    } else if (stackNum == 2) {
      return topOfStack;
    } else if (stackNum == 3) {
      return topOfStack;
    }

    return -1;
  }

  // push
  public void push(int stackNum, int value) {
    // TODO
    if (isFull(stackNum)) {
      System.out.println("The stack is full!");
    } else {
      int index = 0;
      if (stackNum == 1) {
        index = indexOfTop(stackNum);
        arr[index + 1] = value;
        topOfStack++;
      } else if (stackNum == 2) {
        index = indexOfTop(stackNum);
        arr[index + 1] = value;
        topOfStack++;
      } else if (stackNum == 3) {
        index = indexOfTop(stackNum);
        arr[index + 1] = value;
        topOfStack++;
      }
    }
  }

  // pop
  public int pop(int stackNum) {
    // TODO
    if (isEmpty(stackNum)) {
      System.out.println("The stack is empty!");
      return -1;
    } else {
      int index = 0;
      if (stackNum == 1) {
        index = indexOfTop(stackNum);
        topOfStack--;
        return arr[index];
      } else if (stackNum == 2) {
        index = indexOfTop(stackNum);
        topOfStack--;
        return arr[index];
      } else if (stackNum == 3) {
        index = indexOfTop(stackNum);
        topOfStack--;
        return arr[index];
      }
    }

    return -1;
  }

  // peek

  public int peek(int stackNum) {
    // TODO
    if (isEmpty(stackNum)) {
      System.out.println("The stack is empty!");
      return -1;
    } else {
      int index = 0;
      if (stackNum == 1) {
        index = indexOfTop(stackNum);
        return arr[index];
      } else if (stackNum == 2) {
        index = indexOfTop(stackNum);
        return arr[index];
      } else if (stackNum == 3) {
        index = indexOfTop(stackNum);
        return arr[index];
      }
    }
    return -1;
  }
}
