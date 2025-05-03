//Leetcode 1 : Two Sum
//Topic : Array, Hash Table
package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> m = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int diff=target - nums[i];
        if(m.containsKey(diff)){
        return new int []{m.get(diff),i};
        }
        m.put(nums[i],i);

       }
       return new int []{};

    }
}
