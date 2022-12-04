/**
 * QueueViaStack
 *
 * This class implements a queue via two array stacks
 */
public class QueueViaStack {
  int[] stack1;
  int[] stack2;
  int topOfStack1 = -1;
  int topOfStack2 = -1;
  int size1 = -1;
  int size2 = -1;

  public QueueViaStack(int size) {
    stack1 = new int[size];
    stack2 = new int[size];
  }

  //push
  public void enQueue(int value) {
    if (isFull() == false) {
      topOfStack1++;
      stack1[topOfStack1] = value;
      size1++;
      System.out.println("topOfStack " + topOfStack1);

      System.out.println("Added " + value + " successfully.");
    } else {
      System.out.println("The first stack is full!");
    }
  }

  //stack1
  public boolean isFull() {
    return topOfStack1 == stack1.length - 1;
  }

  //stack2 isEmpty
  public boolean isEmpty() {
    return topOfStack2 == -1;
  }

  //   public void pop(int[] arr) {
  //     int value = 0;
  //     for (int i = 0; i <= stack1.length - 1; i++) {
  //       value = stack1[topOfStack1];
  //       topOfStack1--;
  //       size1--;
  //       size2++;
  //       topOfStack2++;
  //       stack2[topOfStack2] = value;
  //       System.out.println("added " + value + " at index " + i + " in stack2");
  //     }
  //   }

  public int deQueue(int[] arr) {
    int value = 0;
    int index = stack1.length - topOfStack1 - 2;
    // System.out.println(
    //   "stack1 length:" + stack1.length + " | topOfStack1: " + topOfStack1
    // );
    value = stack1[index]; //Get the zeroth element in stack 1
    topOfStack2 = topOfStack1 + 1; //grabbing index
    topOfStack1--;
    size1--;
    size2++;
    stack2[topOfStack2] = value; //save 1 at index 4 aka  top of stack 2
    System.out.println(
      "added " + value + " at index " + topOfStack2 + " in stack2"
    );
    return value;
  }
  //   public void deQueue() {
  //     pop(this.stack1);
  //     int index = topOfStack2;
  //     while (index >= 0) {
  //       System.out.println(stack2[index]);
  //       index--;
  //     }
  //   }
}
