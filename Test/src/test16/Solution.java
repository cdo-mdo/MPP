package test16;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == '(' || chr == '[' || chr == '{') {
                stack.push(chr);      
            }
            else {
                char chr1 = stack.pop();
                if ((chr == ')' && chr1 != '(') || 
                   (chr == ']' && chr1 != '[') ||
                   (chr == '}' && chr1 != '}')) {
                    return false;
                   }
            }
       }
       if (!stack.empty()) {
           return false; 
       } 
       return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("([{}])"));
    }
}