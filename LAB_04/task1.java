class LinearQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public LinearQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isfull() {
        return rear == capacity - 1;
    }

    public boolean isempty() {
        return front == -1;
    }

    public void enqueue(int item) {
        if (isfull()) {
            System.out.println("Queue is full: Overflow");
        } else {
            if (isempty()) {
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1; // increment rear by 1
            }
            queue[rear] = item;
            System.out.println("Element enqueued on Queue is: " + item);
        }
    }

    public int dequeue() {
        int item = 0;
        if (isempty()) {
            System.out.println("Queue is empty: Underflow");
        } else {
            item = queue[front];
            System.out.println("Element dequeued from Queue is: " + item);

            if (front == rear) { // Check if only one item is left
                front = -1; // Reset queue to empty state
                rear = -1;
            } else {
                front = front + 1;
            }
        }
        return item;
    }

    public void peek() {
        if (isempty()) {
            System.out.println("\nQueue is Empty\n");
        } else {
            System.out.println("\nFront Element is: " + queue[front]);
        }
    }
}

public class task1 {
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
        q.dequeue();
        q.peek();
    }

}
