//Leetcode 1402 : Reducing Dishes
//Topic : Array, Dynamic Programming, Greedy, Sorting
package Hard;

import java.util.Arrays;
class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0;
        int res = 0;
        for (int i = satisfaction.length - 1; i >= 0 ; i--) {
            sum += satisfaction[i];
            res = Math.max(res,res+sum);
        }
        return res;
    }
}

//a+2b+3c = c + (b + c) + (a + b + c)
