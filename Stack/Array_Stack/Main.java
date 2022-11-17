public class Main {

  public static void main(String[] args) {
    Stack newStack = new Stack(4);
    boolean result = newStack.isFull();
    System.out.println(result);
    newStack.push(3);
    newStack.push(4);
    newStack.push(5);
    newStack.push(6);
    newStack.push(7);
    System.out.println("Peek: " + newStack.peek());
    result = newStack.isFull();
    System.out.println(result);
    int answer = newStack.pop();
    System.out.println(answer);
    int answer2 = newStack.pop();
    System.out.println(answer2);
    newStack.deleteStack();
  }
}
