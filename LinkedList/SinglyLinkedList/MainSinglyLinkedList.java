public class MainSinglyLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    //System.out.println(sLL.head.value);
    System.out.println("-----Insertion Method-----");
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    //System.out.println(sLL.head.next.next.value); //shows 3rd element in sLL
    // sLL.traverseSinglyLinkedList();
    //sLL.searchNode(15);
    //sLL.deletionOfNode(20);
    sLL.traverseSinglyLinkedList();
    System.out.println("The tail is: " + sLL.tail.value);

    System.out.println("Deleting SLL");
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();
  }
}
