class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = this;
    }
}
public class CLLInsertAtEnd {

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
    if (head == null) {
            return newNode;
        }

        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
         return head;
    }

    public static void main(String[] args) {
        Node head = null;
        
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        System.out.print("Circular Doubly Linked List: ");
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(); // Output: 10 20 30
    }
}
