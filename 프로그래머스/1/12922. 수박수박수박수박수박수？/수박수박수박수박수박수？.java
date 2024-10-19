class Solution {
    public String solution(int n) {
        String answer = "";
        int num;
        String word = "수박";

        if ( n % 2 == 0 ) {
            num = n / 2;
            for(int i = 0; i < num; i++) {
                answer += word;
            }            
        } else {
            num = n / 2;
            for(int i = 0; i < num; i++) {
                answer += word;
            } 
            answer += "수";
        }
        return answer;
    }
}