//Leetcode 2551 : Put Marbles in Bags
//Topic : Array, Greedy, Sorting, Heap (Priority Queue)
package Hard;

import java.util.Arrays;
class PutMarblesinBags {
    public long putMarbles(int[] weights, int k) {
        // We collect and sort the value of all n - 1 pairs.
        int n = weights.length;
        int[] pairWeights = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pairWeights[i] = weights[i] + weights[i + 1];
        }
        // We will sort only the first (n - 1) elements of the array.
        Arrays.sort(pairWeights, 0, n - 1);

        // Get the difference between the largest k - 1 values and the
        // smallest k - 1 values.
        long res = 0l;
        for (int i = 0; i < k - 1; ++i) {
           res += pairWeights[n - 2 - i] - pairWeights[i];
        }

        return res;
    }
}
