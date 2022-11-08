public class AlphabetPrinter {

  public void letterPrinter() {
    int a = 2;
    int b = 2;
    int c = 2;
    String word = "";
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int k = 0; k < c; k++) {
          word += 'A';
        }
        word += 'B';
      }
      word += 'C';
    }
    System.out.println(word);
  }

  public static void main(String[] args) {
    AlphabetPrinter ap = new AlphabetPrinter();
    ap.letterPrinter();
  }
}
