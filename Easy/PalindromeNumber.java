//Leetcode 9 : Palindrome Number
//Topic : Math
package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(rev==temp)
        return true;
        else
        return false;    
    }
}
