import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        
        List <Integer> list = new ArrayList<>();
            
        while(n!=0){
            list.add(n%3);
            n/=3;
        
        }
        
        
        int answer = 0;
        for(int i=list.size() -1; i>=0; i--){
            int num =  list.size()-1-i;
            answer += list.get(num) * (int) Math.pow(3,i);
        }
        
        return answer;
    } 
}