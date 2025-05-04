class Solution {
    public int[] solution(int n, int m) {
        
        int gcd=0;
        int gcm=0;
        if(n<m){
            for(int i=n; i>0; i--){
                if(n%i==0 && m %i==0){
                    gcd = i;
                    break;
                }
            }
        }else if(n>m){
            for(int i=m; i>0; i--){
                if(n%i==0 && m %i==0){
                    gcd = i;
                    break;
        }
            }}
        
        gcm = (n*m)/gcd;
        
        
        int[] answer = {gcd, gcm};
        return answer;
    }
}