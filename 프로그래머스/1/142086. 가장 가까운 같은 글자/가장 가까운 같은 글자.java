class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        StringBuilder []sb = new StringBuilder[s.length()];
        
         
        for(int i=0; i<s.length(); i++){
            sb[i] = new StringBuilder(String.valueOf(s.charAt(i)));
        }
        
        int  [] orderArray =new int [s.length()];
        
        for(int j=0; j<orderArray.length; j++){
            int distanceCount= 0;
            if (j==0){
                orderArray[j] = -1;
            }
            
            for (int k=j-1; k>=0; k--){
                distanceCount++;
                if(sb[k].toString().equals(sb[j].toString())){
                    orderArray[j] =distanceCount;
                    break;}
                else if (k==0){orderArray[j] =-1;}
            }
        }
    
        
        return orderArray;
    }
}