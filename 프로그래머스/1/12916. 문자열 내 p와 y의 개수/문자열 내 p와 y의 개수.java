class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP =0;
        int countY =0;
        
        String [] str = s.split("");
        
        for(int i=0; i<str.length; i++){
            if (str[i].equals("p") || str[i].equals("P")){
                countP++;
            }else if(str[i].equals("y") || str[i].equals("Y")){
                countY++;
            }
        }
        
        if(countP == countY){
            answer = true;
        }else{
            answer= false;
        }
            
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}