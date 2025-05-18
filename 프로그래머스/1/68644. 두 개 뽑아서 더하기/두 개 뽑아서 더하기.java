import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List <Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<numbers.length-1; i++){
            int indexSum=0;
            for(int j=numbers.length-1; j>=i+1; j--){
                indexSum = numbers[i] + numbers[j];
                if(!list.contains(indexSum)){
                    list.add(indexSum);
                }
            }
        }
        
        int[] answer = new int [list.size()];
        for (int k =0; k<list.size(); k++){
            answer[k] = list.get(k);
        }
       Arrays.sort(answer);
        return  answer;
    }
}