public class Main {

  public static void main(String[] args) {
    // StackMin sm = new StackMin();

    // sm.push(10);
    // sm.min();
    // sm.push(1);
    // sm.push(3);
    // sm.push(2);

    // sm.pop();

    // sm.min();

    QueueViaStack qs = new QueueViaStack(5);
    qs.enQueue(1);
    qs.enQueue(2);
    qs.enQueue(3);
    qs.enQueue(4);

    //qvs.pop(qvs.stack1);

    int answer = qs.deQueue(qs.stack1);
    System.out.println(answer);
    //System.out.println(qvs.size2);
    //boolean result = qvs.isEmpty();
    //System.out.println(result);
  }
}
