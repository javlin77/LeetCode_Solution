//Leetcode 33 : Search in Rotated Sorted Array
//Topic : Array, Binary Search
package Medium;

class SearchInRotatedSortedArray {
        public int search(int[] nums, int target) {
            int l=0, h=nums.length-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(nums[m]==target) {
                    return m;
                } 
                if(nums[m]>=nums[l]){
                    if(nums[l]<=target && target<=nums[m]){
                        h=m-1;
                    }else{
                        l=m+1;
                    }
                }else{
                    if(nums[m]<=target && target<=nums[h]){
                        l=m+1;
                    }else{
                        h=m-1;
                    }
                }
            }  
             return -1;
        }
    }