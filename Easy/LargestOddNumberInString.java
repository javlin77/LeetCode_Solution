//Leetcode 1903 : Largest Odd Number In String
//Topic : Math, String, Greedy
package Easy;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2==1) return num.substring(0,i+1);
        }
        return "";
        
    }
}
