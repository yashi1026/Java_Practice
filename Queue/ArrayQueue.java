public class ArrayQueue {
    int front, rear, capacity;
    int[] queue;

    ArrayQueue(int size) {
        front = rear = -1;
        capacity = size;
        queue = new int[size];
    }

    void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = data;
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted: " + queue[front++]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); 

        q.dequeue(); 
        q.display(); 

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        q.enqueue(70); 
        q.display();   
    }
}

