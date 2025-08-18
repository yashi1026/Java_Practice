class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLInsertAtEnd {

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    public static void main(String[] args) {

        Node head = null;
        head = insertAtEnd(head, 0); // 0
        head = insertAtEnd(head, 10); // 0 -> 10
        head = insertAtEnd(head, 20); // 0 -> 10 -> 20
        head = insertAtEnd(head, 30); // 0 -> 10 -> 20 ->30
        printList(head);
    }

    static void printList(Node head) {
        System.out.print("Forward traversal: ");
        Node temp = head;
        Node tail = null;
        while (temp != null) {
            System.out.print(temp.data + " ");
            tail = temp; 
            temp = temp.next;
        }
        
        System.out.print("\nBackward traversal: ");
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
    }
}
}


