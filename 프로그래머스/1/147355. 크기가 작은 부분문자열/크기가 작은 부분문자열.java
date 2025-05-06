class Solution {
    public int solution(String t, String p) {
         /*      
        int count =0; //비교해서 비교하는 수가 크면 카운트 증가
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String subStr = "";
            for(int j=i; j<i+p.length(); j++){
                subStr +=  t.charAt(j);
            }
            double subNumber = Double.parseDouble(subStr);
            double compareNumber = Double.parseDouble(p);
            
            
            if(subNumber <= compareNumber){
                count++;
            }
        
        }
        int answer = count;
        return answer;
        */
        
        int count = 0;
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String subStr =t.substring(i, i+p.length());
            double subNumber = Double.parseDouble(subStr);
            double compareNumber = Double.parseDouble(p);
            if(subNumber <=compareNumber){
                count++;
            }
        }
        return count;
        
    }
}