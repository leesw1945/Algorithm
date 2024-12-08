import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> filterArr = new ArrayList<>();
        
        for (String str : strArr) {

            if (!str.contains("ad")) {
                filterArr.add(str);
            }
        }
        
        String[] result = new String[filterArr.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = filterArr.get(i);
        }
        
        return result;
    }
}