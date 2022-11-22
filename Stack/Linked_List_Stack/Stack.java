class Stack {
  LinkedList linkedList;

  Stack() {
    linkedList = new LinkedList();
  }

  //Push
  //Time and Space O(1)
  public void push(int value) {
    linkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted " + value + " in stack");
  }

  //isEmpty
  //Space and Time O(1)
  public boolean isEmpty() {
    if (linkedList.head == null) {
      return true;
    } else {
      return false;
    }
  }

  //Pop
  //Space and time is O(1)
  public int pop() {
    int result = -1;
    if (isEmpty()) {
      System.out.println("The stack is empty!");
    } else {
      result = linkedList.head.value;
      linkedList.deletionOfNode(0);
    }
    return result;
  }

  //Peek
  //Time and Space is O(1)
  public int peek() {
    if (isEmpty()) {
      System.out.println("The stack is empty!");
      return -1;
    } else {
      return linkedList.head.value;
    }
  }

  //Delete Method
  //Space and time is O(1)
  public void deleteStack() {
    linkedList.head = null;
    System.out.println("The Stack is deleted!");
  }
}
