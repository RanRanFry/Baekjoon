class Solution {
    public int solution(int[] numbers) {
        
        //0부터 9까지의 총합에서 배열의 합을 빼면 없는 수의 합이다.
        int totalSum =0;
        for(int i=0; i<10; i++){
            totalSum += i;
        }
        int answer;
        int numberSum=0;
        for(int j=0; j<numbers.length; j++){
            numberSum += numbers[j];
        }
        
        answer= totalSum-numberSum;
        return answer;
    }
}