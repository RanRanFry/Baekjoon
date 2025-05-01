class Solution {
    public int solution(int left, int right) {
        //제곱근이 존재하면 약수의 개수가 홀수
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            if(Math.sqrt(i) == (int) Math.sqrt(i)){
                answer -= i;
            
            }else{
                answer +=i;
            }
        }
        
        return answer;
    }
}