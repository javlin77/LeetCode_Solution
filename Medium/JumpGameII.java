//Leetcode 45 : Jump Game
//Topic : Array, Dynamic Programming, Greedy
package Medium;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {                    
                jumps++;
                curEnd = curFarthest;
	    }
    }
	return jumps;
    }
}
