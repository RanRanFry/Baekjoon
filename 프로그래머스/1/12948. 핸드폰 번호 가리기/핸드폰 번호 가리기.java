class Solution {
    public String solution(String phone_number) {  
        String [] phoneArray = phone_number.split("");
        for(int i=0; i<phoneArray.length-4; i++){
            phoneArray[i] = "*";
        }
        String answer = String.join("", phoneArray);
        return answer;
    }
}