class LinearQueue {
    public int[] queue;
    public int capacity;
    public int front;
    public int rear;

    public LinearQueue(int size) {
        this.capacity = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public boolean isEmpty() {
        return front == -1;
    } 

    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Linear Queue is Full...");
        } else {
            if(isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1;
            }
            System.out.println("Enqueue item Successfully " + item);
            queue[rear] = item;
        }
    }

    public int dequeue() {
        int item = 0;
        if(isEmpty()) {
            System.out.println("Linear Queue is Empty...");
        } else {
            item = queue[front];
            System.out.println("Itme is dequeue " + item);
            if(front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = front + 1;
            }
        }
        return item;
    }

    public void peek() {
        if(isEmpty()) {
            System.out.println("Linear Queue is empty");
        } else {
            System.out.println("\nFront Element is: " + queue[front]);
        }
    }
}

public class linearqueuepractice {
    public static void main(String[] args) {

        LinearQueue items = new LinearQueue(5);

        items.enqueue(5);
        items.enqueue(10);
        items.enqueue(15);

        items.dequeue();

        items.peek();

    }
}