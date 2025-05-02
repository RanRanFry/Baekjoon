class Solution {
    public int solution(String s) {
        /*
        int answer = Integer.parseInt(s);
        return answer;
        */
        String [] str = s.split(""); //배열로 담기
        int result = 0;
        int digit = 
        //인트형 배열로 변환
        for(int i=str.length-1; i>=0; i--){
            if (str[0].equals("-")){
                 continue;
            }
            int digit = str[i].charAt(0) - '0';
            result += digit * (int) Math.pow(10,(i));
           
        }
    
        return result;
        
    }
}