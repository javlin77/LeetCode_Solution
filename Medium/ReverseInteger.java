//Leetcode 7 : Reverse Integer
//Topic : Math
package Medium;
class ReverseInteger {
    public int reverse(int x) {
        int result = 0; 
        while (x != 0) {
            int lastDigit = x % 10; 
            x /= 10; 
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ) {
                return 0; 
            }
            result = result * 10 + lastDigit; 
        }
        return result;
    }
}
