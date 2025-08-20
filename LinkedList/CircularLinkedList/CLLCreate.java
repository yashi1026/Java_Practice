class Node {
    int data;
    Node next;
    Node prev; 

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CLLCreate {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = head;

        head.prev = third;
        second.prev = head;
        third.prev = second;

        Node current = head;
        System.out.print("Forward traversal: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        Node tail = head.prev; 
        current = tail;
        System.out.print("\nBackward traversal: ");
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);
    }
}
