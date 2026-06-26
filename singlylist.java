
public class singlylist {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("SuccessFully insert node at First " + data);
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            System.out.println("SuccessFully insert node at First " + data);
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("Inserted " + data + " at the end.");
    }

    public void deleteAtFirst() {
        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        System.out.println("delete element from start " + head.data);
        head = head.next;
    }

    public void deleteAtEnd() {
        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }

        if(head.next == null) {
           System.out.println("delete element from last " + head.data);
           head = null;
           return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted from end: " + temp.next.data);
        temp.next = null;
    }

    public void insertInBetween(int data, int position) {
        // Edge Case 1: If position is 0, it means inserting at the start
        if (position == 0) {
            insertNodeAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        // Traverse to find the node right BEFORE the insertion position
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds! Current list size is smaller.");
                return;
            }
            temp = temp.next;
        }

        // Edge Case 2: Check if the insertion point itself is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        // The magic: Link the new node to the next node, then update the previous node's link
        newNode.next = temp.next;
        temp.next = newNode;
        
        System.out.println("Successfully inserted " + data + " at position " + position);
    }

    public int getSizeList() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void displayList() {

        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while(temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        singlylist gc = new singlylist();

        gc.insertNodeAtFirst(10);
        gc.insertNodeAtFirst(20);
        gc.getSizeList();
        gc.displayList();
        gc.insertNodeAtEnd(30);
        gc.insertNodeAtEnd(50);
        gc.getSizeList();
        gc.displayList();
        gc.insertInBetween(40, 3);
        gc.getSizeList();
        gc.displayList();
    }
}
