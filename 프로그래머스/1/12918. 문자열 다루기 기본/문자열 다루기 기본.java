class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] wordArr = s.toCharArray();
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for(int i = 0; i < wordArr.length; i++) {
            boolean flag = true;
            for (char j : num) {
                if(wordArr[i] == j) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag == false) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}