//Leetcode 35 : Search Insert Position
//Topic : Array, Binary Search
package Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target) {
                return m;
            }else if (nums[m]<target){
                 l=m+1;
            }else h=m-1;
         }
         return l;
    }
}
