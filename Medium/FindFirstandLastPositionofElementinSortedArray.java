//Leetcode 34 : Find First and Last Position of Element in Sorted Array
//Topic : Array, Binary Search
package Medium;

class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int f = findf(nums, target);
        int l = findl(nums, target);
        return new int[]{f, l};
    }

    private int findf(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int f = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                f = m;
                e = m - 1;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return f;
    }

    private int findl(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int l = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                l = m;
                s = m + 1;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return l;
    }
}
