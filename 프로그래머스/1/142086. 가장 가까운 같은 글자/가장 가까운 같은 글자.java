import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String alpha = "";
        for(int i = 0; i < s.length(); i++) {
            String one = "" + s.charAt(i);
            if(alpha.contains(one)) {
                for(int j = i - 1; i >= 0; j--) {
                    String a = "" + s.charAt(j);
                    if (one.equals(a)) {
                        answer[i] = i - j;
                        break;
                    }
                }
            } else {
                alpha += one;
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}