import java.util.Arrays;

class Solution {
    public int makeTotalSum(){
        int first = 1;
        int last = 9;
        double half = (double) last / 2;
        return (int)((first  + last) * half);
    }
    public int solution(int[] numbers) {
        int answer = -1;

        int sum = makeTotalSum();

        int arraySum = Arrays.stream(numbers).sum();

        answer = sum - arraySum;

        return answer;
    }
}