
public class Traversal {
  public static void main(String[] args) {

    TreeNode root = new TreeNode(77, null, null);
    root.left = new TreeNode(22, null, null);
    root.right = new TreeNode(86, null, null);
    root.left.right = new TreeNode(33, null, null);

    preOrder(root);
  }

  public static void preOrder(TreeNode node) {
    if(node == null) {
      return;
    }
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }
}
