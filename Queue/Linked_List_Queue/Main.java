/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    QueueLinkedList newQLL = new QueueLinkedList();

    newQLL.enQueue(10);
    newQLL.enQueue(20);
    newQLL.enQueue(30);
    int result = newQLL.peek();
    System.out.println(result);
    int result2 = newQLL.peek();
    System.out.println(result2);
    newQLL.deleteQueue();
  }
}
