//Leetcode 1611: Minimum One Bit Operations to Make Integers Zero
//Topic : Gray Code,Recursion, Dynamic Programming, Bit Manipulation, Memoization 
package Hard;

class MinimumOneBitOperationstoMakeIntegersZero {
    public int minimumOneBitOperations(int n) {
      if (n == 0) return 0;
          return n ^ minimumOneBitOperations(n >> 1);
    }
}
