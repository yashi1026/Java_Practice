class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SLLInsertAtBegg{
    
    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    
     public static void main(String[] args) {
         
        Node head = null;
        head = insertAtBeginning(head, 30);
        head = insertAtBeginning(head, 20);
        head = insertAtBeginning(head, 10);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}




