import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        
        
        
        
        
        int i =0;
        int count =0;
        int endIndex =arr.length-1;
        while(i <endIndex){
            if(arr[i] == arr[i+1]){
                arr[i] = -100;
                count ++;
            }
            
            i++;
        }
        
        int[] answer =  new int [arr.length-count];
        
        
          int k=0;
        for(int j =0; j<arr.length; j++){
          
            
            if( arr[j]== -100){
                continue;
            }else{
                answer[k++] = arr[j];
            }
           
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
        
        
        
        
        
        
    }
}