import java.util.*;

public class Solution {
    
    public int[] solution(int[] arr) {
        Stack<Integer> ans = new Stack<>();
        
        for (int num: arr) {
            if (ans.isEmpty() || ans.peek() != num) {
                ans.add(num);
            } 
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}