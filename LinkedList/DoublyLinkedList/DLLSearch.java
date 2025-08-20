    public class DLLSearch {

    static boolean search(Node head, int key) {
        
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        System.out.println(search(head, 20)); // true
        System.out.println(search(head, 40)); // false
    }
}





