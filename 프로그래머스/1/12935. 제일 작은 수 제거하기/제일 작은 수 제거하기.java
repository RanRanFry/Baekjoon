import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
       
        int min =arr[0];
        
        for (int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            } 
        }
        
         List<Integer> list = new ArrayList<>();
        
        
        for (int value : arr) {
            if (value != min) {
                list.add(value);
            }
        }
        if (list.isEmpty()){
            return new int [] {-1};
        }

        // List를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}