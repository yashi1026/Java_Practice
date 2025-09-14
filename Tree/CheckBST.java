public class CheckBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isBST(TreeNode root) {
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isBSTUtil(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return isBSTUtil(node.left, min, node.val) &&
               isBSTUtil(node.right, node.val, max);
    }
     public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        boolean result = isBST(root);
        System.out.println("Is the tree a BST? " + result); // Output: true
    }
}
