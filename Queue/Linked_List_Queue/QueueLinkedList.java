public class QueueLinkedList {
  LinkedList list;

  //Time and Space is O(1)
  public QueueLinkedList() {
    list = new LinkedList();
    System.out.println("The Queue is successfully created. ");
  }

  //isEmpty
  //space and time is O(1)
  public boolean isEmpty() {
    if (list.head == null) {
      return true;
    } else {
      return false;
    }
  }

  //enQueue
  //Time and Space is O(1)
  public void enQueue(int value) {
    list.insertInLinkedList(value, list.size);
    System.out.println("Successfully inserted " + value + " in the queue.");
  }

  //deQueue
  //Time and Space is O(1)
  public int deQueue() {
    int value = -1;
    if (isEmpty()) {
      System.out.println("The Queue is empty!");
    } else {
      value = list.head.value;
      list.deletionOfNode(0);
    }
    return value;
  }

  //peek
  //Space and Time is O(1)
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Queue is empty!");
      return -1;
    } else {
      return list.head.value;
    }
  }

  //delete
  //Time and Space is O(1)
  public void deleteQueue() {
    list.head = null;
    list.tail = null;
    System.out.println("The Queue is succesfully deleted.");
  }
}
