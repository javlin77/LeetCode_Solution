//Leetcode 632 : Smallest Range Covering Elements from K Lists
//Topic : Array, Hash Table, Greedy, Sliding Window, Sorting, Heap (Priority Queue)
package Hard;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class SmallestRangeCoveringElementsfromKLists  {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o-> nums.get(o[0]).get(o[1])));
        int max = Integer.MIN_VALUE, l = 0, h = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            q.offer(new int[]{i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        while (q.size() == nums.size()) {
            int e[] = q.poll(), r = e[0], c = e[1];
            if (h - l > max - nums.get(r).get(c)) {
                l = nums.get(r).get(c);
                h = max;
            }
            if (c + 1 < nums.get(r).size()) {
                q.offer(new int[]{r, c + 1});
                max = Math.max(max, nums.get(r).get(c + 1));
            }
        }
        return new int[]{l, h};
        
    }
}
