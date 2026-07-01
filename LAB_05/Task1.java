public class Task1 {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public Task1(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full! Cannot enqueue: " + item);
            return;
        }
        
        if (isEmpty()) {
            front = 0;
        }
        
        queue[rear] = item;
        rear = (rear + 1) % capacity;
        System.out.println("Enqueued: " + item + " | Rear moved to index: " + rear);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return -1;
        }

        int item = queue[front];
        System.out.println("Dequeued: " + item + " | Front was at index: " + front);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        return item;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Front Element is: " + queue[front]);
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.print("Current Queue Layout: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity; 
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Task1 cq = new Task1(4);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.displayQueue();

        cq.enqueue(50); 

        cq.dequeue();
        cq.dequeue();
        cq.displayQueue();

        System.out.println("Re-enqueuing to test circular wrapping:");
        cq.enqueue(50);
        cq.enqueue(60);
        cq.displayQueue();
    }
}