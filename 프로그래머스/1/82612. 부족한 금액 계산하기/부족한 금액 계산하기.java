class Solution {
    public long solution(int price, int money, int count) {
        
        long cost =0;

        for (int i =0; i<count; i++){
            cost +=  (long) price * (i+1);
        }
        long answer = (long) (money -cost) ;
        if (answer<0){
            return -answer;
        }else{
            return 0;
        }
        
    }
}