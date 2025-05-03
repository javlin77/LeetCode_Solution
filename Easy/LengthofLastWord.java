//Leetcode 58 : Length of Last Word
//Topic : String
package Easy;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();       
        int l = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                l++;
            }
            else if (l > 0) {
                break;
            }
        }
        return l;
    }
}
