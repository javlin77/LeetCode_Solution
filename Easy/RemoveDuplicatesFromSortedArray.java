//Leetcode 26 : Remove Duplicates From Sorted Array
//Topic : Array, Two Pointers
package Easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
