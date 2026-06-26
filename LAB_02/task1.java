import java.util.*;

public class task1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        int[] uniqueNumbers = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueNumbers[index++] = num;
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
