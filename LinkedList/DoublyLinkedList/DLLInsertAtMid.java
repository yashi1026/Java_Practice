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
public class DLLInsertAtMid {
 
    static Node insertAtPosition(Node head, int data, int pos) {

        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            return newNode;
        }

        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return head;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    public static void main(String[] args) {

        Node head = null;
        head = insertAtPosition(head, 10, 1); // 10
        head = insertAtPosition(head, 30, 2); // 10 -> 30
        head = insertAtPosition(head, 20, 1); // 20 -> 10 -> 30

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}


