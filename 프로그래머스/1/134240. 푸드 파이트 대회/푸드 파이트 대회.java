import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 1) {
                food[i] = (food[i] - 1)/2;
            } else {
                food[i] /=2;
            }
            for(int j = 0; j < food[i]; j++) {
                arr.add(i);
                answer+=i;
            }
        }
        answer+="0";
        
        for(int i = arr.size()-1; i >=0; i--) {
            answer += arr.get(i);
        }
        
        return answer;
    }
}