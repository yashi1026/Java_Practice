class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLLInsertAtMid {
    
    static Node insertAtPosition(Node head, int data, int pos) {
        
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
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
        current.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        
        Node head = null;
        head = insertAtPosition(head, 10, 1); // 10
        head = insertAtPosition(head, 30, 2); // 10 -> 30
        head = insertAtPosition(head, 20, 2); // 10 -> 20 -> 30
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


