public class task1 {

    public static int agnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; 
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] ascArr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target1 = 12;
        int result1 = agnosticBinarySearch(ascArr, target1);
        System.out.println("Ascending Array Test: Element " + target1 + " found at index: " + result1);

        int[] descArr = {90, 75, 60, 45, 30, 15, 0};
        int target2 = 15;
        int result2 = agnosticBinarySearch(descArr, target2);
        System.out.println("Descending Array Test: Element " + target2 + " found at index: " + result2);
        
    }
}