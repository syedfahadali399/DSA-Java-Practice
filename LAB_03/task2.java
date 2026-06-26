import java.util.Stack;

public class task2 {
    public static void main(String[] args) {

        String str = "FAHAD";
        String reversed = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Reversed String: " + reversed);
    }
}
