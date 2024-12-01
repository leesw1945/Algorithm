class Solution {
    boolean solution(String s) {
        // 'p'와 'y'의 개수를 세기 위한 변수
        int count = 0;
        
        // 문자열을 모두 소문자로 변환
        s = s.toLowerCase();
        
        // 문자열의 각 문자와 'p'와 'y'를 비교하는 반복문
        for (int i = 0; i < s.length(); i++) {
            // 문자가 'p'이면 count를 증가
            if (s.charAt(i) == 'p') {
                count++;
            }
            // 문자가 'y'이면 count를 감소
            else if (s.charAt(i) == 'y') {
                count--;
            }
        }
        
        // count가 0이면 'p'와 'y'의 개수가 같으므로 true 반환, 아니면 false 반환
        return count == 0;
    }
}