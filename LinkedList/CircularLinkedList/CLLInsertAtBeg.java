class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
}

public class CLLInsertAtBeg {

    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }
        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeginning(head, 30); // 30
        head = insertAtBeginning(head, 20); // 20 -> 30
        head = insertAtBeginning(head, 10); // 10 -> 20 -> 30
        head = insertAtBeginning(head, 5);  // 5 -> 10 -> 20 -> 30

        System.out.print("Forward traversal: ");
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.print("\nBackward traversal: ");
        if (head != null) {
            Node tail = head.prev;
            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
        }
    }
}
