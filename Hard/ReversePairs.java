//Leetcode 493 : Reverse Pairs
//Topic : Array, Binary Search,Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set
package Hard;
class reversePairs {
    // Merge function to count reverse pairs and sort the array
    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        int temp[] = new int[high - low + 1];
        int k = 0;

        // Merging two sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Manually copy merged elements back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Count reverse pairs in the current segment
    private static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        // Iterate over left half
        for (int i = low; i <= mid; i++) {
            while (j <= high && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1)); // Count valid pairs
        }

        return count;
    }

    // Merge Sort function with counting logic
    private static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = 0;

        count += mergeSort(arr, low, mid);       // Sort left half
        count += mergeSort(arr, mid + 1, high);  // Sort right half
        count += countPairs(arr, low, mid, high); // Count reverse pairs
        merge(arr, low, mid, high);              // Merge sorted halves

        return count;
    }

    public int reversepairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

}