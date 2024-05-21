import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(i != min){
                list.add(i);
            }
        }
        //list.remove(min);

        if(list.size() == 0){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}