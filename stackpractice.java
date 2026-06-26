class StackPractice {

    int top;
    int size;
    int arr[];

    public StackPractice(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    boolean isStackFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int element) {
        if(!isStackFull()) {
            top++;
            arr[top] = element;
            System.out.println("Element Pushed: " + element);
        } else {
            System.out.println("Stack is full...");
        }
    }

    int pop() {
        if(!isEmpty()) {
            int value = arr[top];
            top--;
            System.out.println("Element Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty");
            return  -1;
        }
    }

    int peek() {
        if(!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    
}

public class stackpractice {
    public static void main(String[] args) {

        StackPractice stack = new StackPractice(5);

        stack.push(20);
        stack.push(30);

        stack.push(50);

        stack.pop();

        System.out.println("Top Element " + stack.peek());
    }
}
