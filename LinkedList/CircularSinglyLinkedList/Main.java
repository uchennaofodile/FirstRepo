class Main {

  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCSLL(5);
    // System.out.println(csll.head.value);
    // System.out.println(csll.head.next.value);

    csll.insertCSLL(2, 0);
    csll.insertCSLL(3, 1);
    csll.insertCSLL(4, 8);
    System.out.println(csll.head.value);
    csll.traverseCSLL();
    csll.searchCSLL(521);
  }
}
