class Solution {
    public int solution(int n) {
        int result = 0; // 약수의 합을 저장할 변수
        
        // 1부터 n의 제곱근까지 반복
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            // n이 i로 나누어 떨어지는지 확인
            if (n % i == 0) {
                // i가 n의 제곱근이 아닌 경우, 두 약수를 더함
                if (n / i != i) {
                    result += n / i + i;
                } else { // i가 n의 제곱근인 경우, 중복된 약수를 한 번만 더함
                    result += i;
                }
            }
        }
        return result; // 최종 약수의 합 반환
    }
}