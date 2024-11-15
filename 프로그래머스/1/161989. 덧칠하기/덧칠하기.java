import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] paint = new int[n];
        for(int s : section) {
            paint[s-1] = 1;
        }
        for(int i = 0; i < paint.length; i++) {
            if(paint[i] == 1){
                for(int j = 0; j < m; j++) {
                    if(i + j < paint.length) {
                        paint[i + j] = 0;
                    }
                }
                i = i + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}