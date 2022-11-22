class Main {

  public static void main(String[] args) {
    CircularQueue cq = new CircularQueue(5);
    cq.enQueue(10);
    cq.enQueue(20);
    cq.enQueue(30);
    cq.enQueue(40);
    boolean result = cq.isFull();
    System.out.println(result);
  }
}
