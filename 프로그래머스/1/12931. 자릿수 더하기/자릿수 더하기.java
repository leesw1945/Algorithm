public class Solution {
    public int solution(int n) {
        // 결과값을 저장할 변수
        int result = 0;
        
        // n이 0보다 큰 동안 반복
        while (n > 0) {
            // n의 마지막 자릿수를 result에 더함
            result += n % 10;
            // n을 10으로 나누어 자릿수를 줄임
            n /= 10;
        } 
        
        // 최종 결과값 반환
        return result;
    }
}