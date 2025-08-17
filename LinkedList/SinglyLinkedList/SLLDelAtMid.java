public class SLLDelAtMid {

    static Node deleteAtPosition(Node head, int pos) {
        if (head == null) return null;

        if (pos == 1) return head.next;

        Node current = head;
        for (int i = 1; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Position out of bounds.");
            return head;
        }

        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteAtPosition(head, 3); // 10 -> 20 -> 40

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

