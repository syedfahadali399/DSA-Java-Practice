class Stack {
    int top;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    boolean isStackFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int element) {
        if (!isStackFull()) {
            top++;
            arr[top] = element;
            System.out.println("Element Pushed: " + element);
        } else {
            System.out.println("Stack is full...");
        }
    }

    int pop() {
        if (!isEmpty()) {
            int value = arr[top];
            top--;
            System.out.println("Element Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }
}

public class task1 {
    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

        System.out.println("Top Element: " + s.peek());
    }
}
