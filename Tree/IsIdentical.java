class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class IsIdentical {

    boolean isIdentical(Node a, Node b) {

        if (a == null && b == null) return true;

        if (a == null || b == null) return false;

        return (a.data == b.data) &&
               isIdentical(a.left, b.left) &&
               isIdentical(a.right, b.right);
    }

    public static void main(String[] args) {
        IsIdentical tree = new IsIdentical();

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        if (tree.isIdentical(root1, root2)) {
            System.out.println("The trees are identical.");
        } else {
            System.out.println("The trees are not identical.");
        }
    }
}
