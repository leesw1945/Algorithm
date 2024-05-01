class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        int i = 0;
        for(int num : numbers){
            sum += num;
            i++;
        }
        answer = sum / i;
        return answer;
    }
}