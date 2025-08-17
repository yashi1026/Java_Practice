public class SLLDelAtBegg {

    static Node deleteAtBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        return head.next;
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteAtBeginning(head); 

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

