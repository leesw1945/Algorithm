import java.util.*;

class Solution {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);
        
        int len = numbers.length;
        
        int negativeNumberMul = numbers[0] * numbers[1];
        
        int positiveNumberMul = numbers[len-1] * numbers[len-2];

        if (negativeNumberMul > positiveNumberMul) {
            return negativeNumberMul;
        }
        return positiveNumberMul;
    }
}