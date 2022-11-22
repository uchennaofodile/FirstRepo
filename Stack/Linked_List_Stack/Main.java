class Main {

  public static void main(String[] args) {
    Stack newStack = new Stack();
    boolean result = newStack.isEmpty();
    System.out.println(result);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    newStack.push(4);
    result = newStack.isEmpty();
    System.out.println(result);
    int answer = newStack.pop();
    System.out.println(answer);
    answer = newStack.pop();
    System.out.println(answer);
    int peekAnswer = newStack.peek();
    System.out.println(peekAnswer);
    newStack.deleteStack();
  }
}
