class Solution {
    public int solution(int n) {
        int result = 0; // 결과를 저장할 변수 초기화

        // 2부터 n-1까지의 숫자 i에 대해 반복
        for (int i = 2; i < n; i++) {
            // n을 i로 나눈 나머지가 1인 경우
            if (n % i == 1) {
                result = i; // result에 i 값을 저장
                break; // 조건을 만족하면 반복 종료
            }
        }

        return result; // 결과 반환
    }
}