class LinkedList {
  public Node head;
  public Node tail;
  public int size;

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
      tail.next = node;
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
  //Time: O(a+b) / Space: O(1)
  public void deletionOfNode(int location) {
    //Checks if List Exist
    if (head == null) { //O(1)
      System.out.println("The SLL does not exist!");
      return;
    }
    //Deletes first element
    else if (location == 0) { //O(1)
      //Head equals the next element in the list
      head = head.next; //O(1)

      size--; //O(1)
      //Only one node
      if (size == 0) { //O(1)
        tail = null;
      }
    } else if (location >= size) { //O(1)
      Node tempNode = head;

      /*We use size -1 because we need to find the node located
       * before the last one
       *
       * DELETION AT THE END
       */
      //new code starts
      // while (tempNode.next != null) {
      //   pointer = tempNode;
      //   tempNode = tempNode.next;
      // }
      // if (tempNode == head) {
      //   tail = head = null; //O(1)
      //   size--;
      //   return;
      // }
      // pointer.next = null;
      // tail = tempNode;
      // System.out.println("The tail value is: " + this.tail.value);
      // size--;
      //new code ends

      for (int i = 0; i < size - 1; i++) { //O(n)
        tempNode = tempNode.next; //Goes to node just before the end
      }
      //Only one node
      if (tempNode == head) {
        tail = head = null; //O(1)
        size--;
        return;
      }
      /*Sets tail to null and
        second to last node is set to tail
         */
      tempNode.next = null; //O(1)
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) { //O(n)
        tempNode = tempNode.next;
      }
      //Assigns to next node after deleted one
      tempNode.next = tempNode.next.next;
      size--; //O(1)
    }
  }

  //Delete entire Singly Linked List
  //Time: O(1) //Space: O(1)
  public void deleteSLL() {
    head = tail = null;
    System.out.println("The SLL deleted successfully!");
  }
}
