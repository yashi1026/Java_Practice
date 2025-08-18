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
public class DLLInsertAtBegg {

    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        return newNode; 
    }
    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeginning(head, 30); // 30
        head = insertAtBeginning(head, 20); // 20 -> 30
        head = insertAtBeginning(head, 10); // 10 -> 20 -> 30
        head = insertAtBeginning(head, 5); // 5 -> 10 -> 20 -> 30

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

