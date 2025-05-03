class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        /* try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException n){
                return false;
        } */
        
        return (s.length() == 4 || s.length() == 6) &&s.matches("\\d+");
           
    }
}