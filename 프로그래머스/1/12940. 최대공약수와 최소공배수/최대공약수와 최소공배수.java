class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGreatestCommonFactor(n,m);
        answer[1] = getLeastCommonMultiple(n,m,answer[0]);
        return answer;
    }
    
    public int getGreatestCommonFactor(int n, int m){
        if(m == 0) return n;
        return getGreatestCommonFactor(m,n%m);
    }
    
    public int getLeastCommonMultiple(int n, int m, int gcf){
        return n*m/gcf;
    }
}