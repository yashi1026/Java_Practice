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
public class DLLDelAtMid {

    static Node deleteAtPosition(Node head, int pos) {
        if (head == null) return null;

        if (pos == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        Node current = head;
        for (int i = 1; i < pos && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return head;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        return head;
    }

    public static void main(String[] args) {

        Node head = null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head = deleteAtPosition(head, 2); // Removes 20
    
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}


