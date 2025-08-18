class Node {
   int data;
   Node prev;
   Node next;

   Node(int var1) {
      this.data = var1;
      this.prev = null;
      this.next = null;
   }
}

public class DLLDelAtBegg {
 
    static Node deleteAtBeginning(Node head) {
        if (head == null) return null;

        head = head.next;
        if (head != null) head.prev = null;
        return head;
    }

    public static void main(String[] args) {
        
        Node head = null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head = deleteAtBeginning(head); // Removes 10
    
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}


