public class StackMin {
  public Node head;
  public int size;
  public Node min;
  public Node prevMin;

  public StackMin() {
    // TODO
    this.head = new Node();
    this.prevMin = new Node();
    this.min = null;
    this.head = min;
  }

  public int min() {
    // TODO
    /*
      Grab the lowest value in the stack
          compare  the head value to the next ref
          then check the next value and so on
          Return the smallest value
      Return the value
      */
    try {
      System.out.println("The min value is " + min.value + ".");
      return min.value;
    } catch (Exception e) {
      // TODO: handle exception
      System.err.println(e.getMessage());
      return -1;
    }
  }

  public void push(int value) {
    // TODO
    Node newNode = new Node();
    newNode.value = value;
    newNode.next = head; //head.next
    this.head = newNode;
    size++;
    //System.out.println("The new size is " + size);
    System.out.println("Successfully inserted " + value + " into the Stack.");
    if (size == 1) {
      this.min = head;
      min.value = value;
    } else {
      prevMin.value = min.value;
      if (value < min.value) {
        min.value = value;
      }
    }
  }

  public int pop() {
    // TODO
    if (size == 0) {
      System.out.println("The Stack is empty!");
      return -1;
    } else if (size == 1) {
      head = null;
      System.out.println("Successfully removed the value from the Stack.");
      min = null;
      System.out.println("The min does not exist!");
      size--;
      return -1;
    } else {
      int value = head.value;

      head = head.next;
      size--;
      if (this.min.value == value) {
        this.min.value = this.prevMin.value;
      }

      return value;
    }
  }
}
