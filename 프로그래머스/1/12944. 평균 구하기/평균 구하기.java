import java.util.Arrays;

class Solution {
        public double solution(int[] arr) {
           /* double answer = 0;

            for(int i=0; i<arr.length; i++){
                answer += arr[i];
            } */
            
            // double sum = Arrays.stream(arr).sum();
            //Arrays.stream(arr).sum()/(double)arr.length;
            return Arrays.stream(arr).sum()/(double)arr.length;
            
                
                
        }
    }