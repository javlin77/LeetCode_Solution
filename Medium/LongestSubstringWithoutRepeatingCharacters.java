//Leetcode 3 : Longest Substring Without Repeating Characters
//Topic : Hash Table, String, Sliding Window
package Medium;

import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters  {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniq = new HashSet<>(); 
        int l = 0; 
        int res = 0; 
        for (int r = 0; r < s.length(); r++) {
            while (uniq.contains(s.charAt(r))) {
                uniq.remove(s.charAt(l)); 
                l++; 
            }
            uniq.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
