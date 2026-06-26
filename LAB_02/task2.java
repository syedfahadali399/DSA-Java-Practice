public class task2 {
    public static void main(String[] args) {
        
        int[] numbers = {12, 7, 18, 25, 30, 4, 11};
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum of all even numbers: " + sum);
    }
}
