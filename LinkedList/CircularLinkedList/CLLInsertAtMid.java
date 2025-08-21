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
public class CLLInsertAtMid {

    static Node insertAtPosition(Node head, int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            if (pos == 1) {
                return newNode;
            } else {
                System.out.println("Position out of bounds.");
                return null;
            }
        }
        if (pos == 1) {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            head.prev = newNode;
            last.next = newNode;

            return newNode; 
        }
        Node current = head;
        for (int i = 1; i < pos - 1; i++) {
            current = current.next;
            if (current == head) {
                System.out.println("Position out of bounds.");
                return head;
            }
        }

        Node nextNode = current.next;
        current.next = newNode;
        newNode.prev = current;
        newNode.next = nextNode;
        nextNode.prev = newNode;

        return head;
    }
    public static void main(String[] args) {

        Node head = null;
        head = insertAtPosition(head, 10, 1); // 10
        head = insertAtPosition(head, 30, 2); // 10 -> 30
        head = insertAtPosition(head, 20, 2); // 10 -> 20 -> 30
        head = insertAtPosition(head, 40, 1); // 40 -> 10 -> 20 -> 30
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
