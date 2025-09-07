public class CircularQueue {
    int[] queue;
    int front, rear, size;

    CircularQueue(int k) {
        size = k;
        queue = new int[size];
        front = rear = -1;
    }

    boolean enqueue(int val) {
        if ((rear + 1) % size == front) return false; // Full
        if (front == -1) front = rear = 0;
        else rear = (rear + 1) % size;
        queue[rear] = val;
        return true;
    }

    boolean dequeue() {
        if (front == -1) return false; // Empty
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
        return true;
    }

    int Front() {
        return (front == -1) ? -1 : queue[front];
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        System.out.println(cq.enqueue(1)); // true
        System.out.println(cq.enqueue(2)); // true
        System.out.println(cq.enqueue(3)); // false (full)
        System.out.println(cq.Front());    // 1
        System.out.println(cq.dequeue());  // true
        System.out.println(cq.enqueue(3)); // true
        System.out.println(cq.Front());    // 2
    }
}
