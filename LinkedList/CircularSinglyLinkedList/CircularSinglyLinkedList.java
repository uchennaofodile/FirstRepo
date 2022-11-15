public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createCSLL(int nodeValue) {
    //Time is O(1) / Space is O(1)
    head = new Node();
    Node node = new Node();
    node.value = nodeValue;
    node.next = node;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  //Time O(N) / Space O(1) we only insert one node
  public void insertCSLL(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;

    //Check for LinkedList
    if (head == null) {
      createCSLL(nodeValue);
      return;
    }
    //Location First
    else if (location == 0) {
      node.next = head;/*head is the previous head NODE */
      head = node;
      tail.next = head;
      return;
    } else if (location >= size) { //Adds @ end
      tail.next = node;
      tail = node;
      tail.next = head;
    } else { //Adds at a specified location
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }

      tempNode.next = node;
      node.next = tempNode.next;
    }
    size++;
  }

  //Traverse CSLL
  //Time O(n) / Space O(1)
  public void traverseCSLL() {
    if (head != null) {
      Node tempNode = head;
      int index = 0;
      while (index <= size) {
        System.out.print(tempNode.value);
        if (index != size) {
          System.out.print(" ---> ");
        }
        tempNode = tempNode.next;
        index++;
      }
      System.out.println();
      return;
    }
    System.out.println("\nCircular Singly Linked List does not exist!");
  }

  //Search Method
  //Time O(N) / Space O(1)
  public boolean searchCSLL(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.println("Found " + nodeValue + " at location " + i + ".");
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("Node not found!");
    return false;
  }
}
