import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        
        /*
        int answer = 0;
        
        int sum =0;
        int endNumber = d[0];
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget){
                endNumber = d[i-2];
                break;
            }else if(sum ==budget){
                return answer;
            }
            
        }
        //다음 번호
        sum =0;
        bigNumber = i+1;
        for(int j =0; j<endNumber; j++){
            sum += d[j];
        }
        if(sum + d[bigNumber] < budget){
            sum += d[bigNumber++]; //재귀 쓰고 싶다.
        }
        
        if(sum > budget){
            endNumber --;
            
        }
        //반복
        int startNumber==0
        if (endNumber == 0;){
            startNumber++;
            
        }
        
        return answer;
        */
        
        int answer = 0;
        int sum =0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++){
            sum +=d[i];
            if(sum<=budget){
                answer++;
            }else{
                break;
            }
            
        }
        return answer;
    }
}