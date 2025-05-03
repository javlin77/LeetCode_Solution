//Leetcode 20 : Valid Parentheses
//Topic : String, Stack
package Easy;

import java.util.Stack;

public class ValidParentheses {
     public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()) return false;
                char y=stack.pop();
                if(x==')' && y!='(') return false;
                if(x==']' && y!='[') return false;
                if(x=='}' && y!='{') return false;
            }
        }
        return stack.size()==0;
    }
}
