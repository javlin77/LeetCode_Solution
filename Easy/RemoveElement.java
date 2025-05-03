//Leetcode 27 : Remove Element
//Topic : Array, Two Pointers
package Easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[res]=nums[i];  // Move unequal element to the front
                res++;
            }
        }
        return res;
    }
}
