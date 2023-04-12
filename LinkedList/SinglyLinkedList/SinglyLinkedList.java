/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
  //Head is not a node, it is a pointer to the first node
  Node head;
  //Tail is not a node, it is a pointer to the last node
  Node tail;
  int size;/*How many many nodes
 we have in our singly linked list*/

  public Node createSinglyLinkedList(int nodeValue) { //O(1) time and space (only creating a single node)
    //Creating head ---->Time Complexity: O(1)
    head = new Node();
    //Creating node---->Time Complexity: O(1)
    Node node = new Node();
    //Setting reference for newly created node ---->Time Complexity: O(1)
    node.next = null;

    //Sets node's value ---->Time Complexity: O(1)
    node.value = nodeValue;

    //make the new node as the first node of the list ---->Time Complexity: O(1)
    //head is nothing more than a pointer to the first node
    //head exists at all times, but is not a node per se
    //head tells us where our linked list starts
    //head is a pointer to the first node
    head = node;

    //New node is tail---->Time Complexity: O(1)
    //tail is nothing more than a pointer to the last node
    //tail exists at all times, but is not a node per se
    //tail tells us where our linked list ends
    //tail is a pointer to the last node
    tail = node;

    //Single Linked List Size---->Time Complexity: O(1)
    size = 1;

    return head;
  }

  //Insert Method SinglyLinkedList Time O(n) Space O(1) b/c when we call
  //create singly linked list we only create one node
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node(); //O(1)
    node.value = nodeValue; //O(1)
    //Creates a singly linked list if one doesn't exist
    if (head == null) { //O(1)
      createSinglyLinkedList(nodeValue); //O(1)
      return;
    }
    //Location is an arbritrary term used to designate where
    //the new node is inserted
    //Inserts new node at the beginning of the list in front of head
    else if (location == 0) { //O(1)
      /*For new node, next reference is taken from the current head
      Assigns the next reference from head to new node*/
      node.next = head;
      head = node; //head now points to new first node
    } else if (location >= size) { //O(1)
      node.next = null;
      tail.next = node; //sets the old last node's reference to our new last node
      tail = node; //tail points to the last node
    } else { //O(1)
      Node tempNode = head; //start loop from head
      int index = 0;
      while (index < location - 1) {/*looping O(n)
till we reach specified node*/
        tempNode = tempNode.next; //because each time we go to the next node
        index++; //until we find the specified location O(1)
        //when we finish the tempNode stores a reference to the node
      }
      //then we insert after
      /*We reach the location of where we want to insert a node
and then we take the next 
reference of this node and store in the nextNode variable*/

      /*stores the pointer for tempNode into a "
new" object called nextNode
Best way to think about it:
tempNode.next = another object in memory
Simplified: so we are taking that object and storing it somewhere else so 
it can be used to insert our new node (Complex: i.e. creating a reference to it)

*/
      Node nextNode = tempNode.next; //O(1)

      /*Points tempNode to our newly created node */
      tempNode.next = node; //O(1)

      /*Points newly created node to "nextNode" 
reference thus completing the insertion

p.s. All nextNode is is a reference to the next node in the list
nextNode doesn't "really" exist (although it does)*/
      node.next = nextNode; //O(1)
    }
    size++; //O(1)
  }

  //SinglyLinkedList Traversal - Time: O(n), Space: O(1) extra memory is not required to traverse this sLL
  public void traverseSinglyLinkedList() {
    if (head == null) { //O(1)
      System.out.println("SLL does not exist"); //O(1)
    } else {
      Node tempNode = head; //O(1)
      for (int i = 0; i < size; i++) { //O(n)
        System.out.print(tempNode.value); //O(1)
        if (i != size - 1) { //O(1)
          System.out.print(" -> "); //O(1)
        }
        tempNode = tempNode.next; //O(1)
      }
    }
    System.out.println("\n"); //O(1)
  }

  //Search for a node - Time O(1)/Space O(1)-Linear Search

  public boolean searchNode(int nodeValue) {
    if (head != null) { //O(1)
      Node tempNode = head;
      for (int i = 0; i < size; i++) { //O(N)
        if (tempNode.value == nodeValue) {
          System.out.println("Found the node at location " + i + ".\n"); //O(1)
          return true; //O(1)
        }
        tempNode = tempNode.next; //O(1)
      }
    }
    System.out.println("Node not found!"); //O(1)
    return false; //O(1)
  }

  //Deleting a node from a SinglyLinkedList
  //Time: O(n) / Space: O(1)
  public void deletionOfNode(int location) {
    // Checks if the linked list exists
    if (head == null) {
      System.out.println("The SLL does not exist!");
      return;
    }

    // Deletes the first element
    if (location == 0) {
      head = head.next;
      size--;

      // If the linked list is now empty, set tail to null
      if (size == 0) {
        tail = null;
      }
    }
    // Deletes the last element
    else if (location >= size) {
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = null;
      tail = tempNode;
      size--;
    }
    // Deletes an element in the middle of the linked list
    else {
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  //Delete entire Singly Linked List
  //Time: O(1) //Space: O(1)
  public void deleteSLL() {
    head = tail = null;
    System.out.println("The SLL deleted successfully!");
  }
}
