class Solution {
    public String solution(int n) {
        String [] subakArr = new String[n];
        for(int i=0; i<subakArr.length; i++){
            if(i%2 ==0){
                subakArr[i]  = "수";
            }
            else{
                subakArr[i]  = "박";}
        }
        String answer = String.join("", subakArr);
        return answer;
    }
}