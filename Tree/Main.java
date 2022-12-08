class Main {

  public static void main(String[] args) {
    TreeNode drinks = new TreeNode("Drinks"); //Root
    TreeNode hot = new TreeNode("Hot"); //Child to root
    TreeNode cold = new TreeNode("Cold");
    TreeNode tea = new TreeNode("Tea");
    TreeNode coffee = new TreeNode("Coffee");
    TreeNode wine = new TreeNode("Wine");
    TreeNode beer = new TreeNode("Beer");
    drinks.addChild(hot);
    drinks.addChild(cold);
    hot.addChild(tea);
    hot.addChild(coffee);
    cold.addChild(wine);
    cold.addChild(beer);
    System.out.println();
    System.out.println(drinks.print(0));
    BinaryTreeLL binaryTree = new BinaryTreeLL();
  }
}
