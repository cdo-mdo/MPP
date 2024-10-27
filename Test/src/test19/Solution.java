package test19;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        Map<Character, Integer> seens = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (seens.containsKey(c) && seens.get(c) >= start) {
                System.out.println("c = " + c);
                max = Math.max(max, i - start);
                start = seens.get(c) + 1;
            } 
            seens.put(c, i);
        }
        System.out.println("max = " + max + " start = " + start);
        max = Math.max(max, s.length() - start);
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
    }
}
