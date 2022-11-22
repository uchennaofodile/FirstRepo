class Main {

  public static void main(String[] args) {
    QueueArray newQueue = new QueueArray(5);
    newQueue.enQueue(1);
    newQueue.enQueue(2);
    int peekAnswer = newQueue.peek();

    System.out.println(peekAnswer);
    newQueue.enQueue(3);
    int result = newQueue.deQueue();
    newQueue.peek();
    //var result = newQueue.isEmpty();
    System.out.println(result);
    newQueue.deleteQueue();
  }
}
