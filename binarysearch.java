public class binarysearch {

    public static int agnosticSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean ascending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(ascending) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 12;
        int result = agnosticSearch(arr, target);
        System.out.println("The Element " + target + " Found at index " + result);
    }
    
}
