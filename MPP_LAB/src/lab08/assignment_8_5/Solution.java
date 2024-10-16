package lab08.assignment_8_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        List<String> list = new ArrayList<>();
        list.add("this"); list.add("is"); list.add("the"); list.add("test");
        
        System.out.println(solution.countWords(list, 't', 'e', 3));
    }
    
    public int countWords(List<String> words, char c, char d, int len) {
        return words.stream()
                .filter(name -> name.length() > len)
                .filter(name -> name.indexOf(c) != -1)
                .filter(name -> name.indexOf(d) == -1)
                .collect(Collectors.toList()).size();
    }
}
