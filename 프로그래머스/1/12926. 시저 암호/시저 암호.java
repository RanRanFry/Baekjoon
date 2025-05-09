class Solution {
    public String solution(String s, int n) {
        
        char [] arr =  s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] ==' '){
                continue;
            }
            else if( 'a'<= arr[i] &&arr[i] <='z'){
               
                arr[i] = (char) ( (arr[i] -'a' + n)% 26+'a');
                
            }else if('A'<= arr[i] &&arr[i] <='Z'){
                 arr[i] =(char) ((arr[i] -'A' + n)% 26 +'A') ;
            }
            else{
                arr[i]=(char) (arr[i] + n);
            }
        }
        
        String answer = "";
        for(char c: arr){
            answer +=  c;
        }
        return answer;
    }
}