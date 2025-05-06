class Solution {
    public int solution(String t, String p) {
        
        int count =0; //비교해서 크면 카운트 증가
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String subStr = "";
            for(int j=i; j<i+p.length(); j++){
                subStr +=  t.charAt(j);
            }
            Long subNumber = Long.parseLong(subStr);
            Long compareNumber = Long.parseLong(p);
            
            
            if(subNumber <= compareNumber){
                count++;
            }
        
        }
        int answer = count;
        return answer;
    }
}