class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
    static Node deleteAtBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        if (head.next == head) {
            return null;
        }

        Node tail = head.prev;
        Node newHead = head.next;

        tail.next = newHead;
        newHead.prev = tail;

        return newHead;
    }
}

public class CLLDelAtBegg {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = head;
        head.prev = fourth;

        // Now list is: 10 <-> 20 <-> 30 <-> 40 (circular)

        head = Node.deleteAtBeginning(head);

        System.out.print("Forward traversal after deletion: ");
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();

        System.out.print("Backward traversal after deletion: ");
        if (head != null) {
            Node tail = head.prev;
            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
        }
        System.out.println();
    }
}

