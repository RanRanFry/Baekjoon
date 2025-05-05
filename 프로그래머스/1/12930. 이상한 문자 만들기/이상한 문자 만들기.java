class Solution {
    public String solution(String s) {
        
        /*
        String [] str = s.split(" ", -1);
        
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length; i++){
            StringBuilder words= new StringBuilder();
            
            for(int j=0; j<str[i].length(); j++){
                char c= str[i].charAt(j);
                if( j%2==0){
                    words.append(Character.toUpperCase(c));
                }else{
                     words.append(Character.toLowerCase(c));
                }
                
            }
            result.append(words);
            if(i<str.length-1){
                result.append(" ") ;
            }
            
            
        } 
       
        
        
        // String answer = str.join(" ");
        return result.toString();
         */
        
        
         String[] words = s.split(" ",-1);  // 공백 여러 개도 보존
    String result = "";

    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        String transformed = "";

        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if (j % 2 == 0) {
                transformed += Character.toUpperCase(c);
            } else {
                transformed += Character.toLowerCase(c);
            }
        }

        result += transformed;
        if (i != words.length - 1) {
            result += " ";  // 단어 사이 공백 유지
        }
    }

    return result; 
    
    }
}