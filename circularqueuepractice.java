class CircularQueue {

    public int[] queue;
    public int capacity;
    public int front;
    public int rear;

    public CircularQueue(int size) {
        this.capacity = size;
        queue = new int[size];
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
        if(isFull()) {
            System.out.println("Circular queue is full cannot push: " + item);
            return;
        }

        if(isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = item;
        System.out.println("Successfully Enqueued " + item);
    }

    public int dequeue() {
        
        if(isEmpty()) {
            System.out.println("Circular queue is empty");
            return -1;
        }

        int item = queue[front];
        System.out.println("Successfully Dequeued " + item);

        if(front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public void peek() { 
        if(isEmpty()) {
            System.out.println("Circular queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    public void displayQueue() {
        if(isEmpty()) {
            System.out.println("Circular queue is empty");
            return;
        }

        System.out.print("Current Queue Layout: ");
        int i = front;
        while(true) {
            System.out.print(queue[i] + " ");
            if(i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println("\n");
    }
}

public class circularqueuepractice {
    public static void main(String[] args) {

        CircularQueue myqueue = new CircularQueue(3);

        myqueue.enqueue(50);
        myqueue.enqueue(60);
        myqueue.enqueue(70);
        myqueue.peek();
        myqueue.displayQueue();

        myqueue.dequeue();
        myqueue.peek();

        myqueue.enqueue(80); 
        myqueue.displayQueue();
    }
}