class Solution {
    public int solution(long num) {
        int result = 0; 
        
        while (true) {
            if (num == 1 || result >= 500) break;
            
            result++;

            if (num % 2 == 0) num = num / 2;
            else num = num * 3 + 1;
        }
        return (num == 1) ? result : -1;
    }
}