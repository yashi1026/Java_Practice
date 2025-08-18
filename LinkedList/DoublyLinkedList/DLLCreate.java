class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLLCreate {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        Node current = head;
        System.out.print("Forward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.print("\nBackward traversal: ");
        current = third;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }
}
