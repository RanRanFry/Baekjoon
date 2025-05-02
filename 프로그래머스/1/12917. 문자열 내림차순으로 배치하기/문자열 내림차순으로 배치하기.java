import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String [] str = s.split("");
        Arrays.sort(str);
        List<String> list = new ArrayList<> (Arrays.asList(str));
        
        Collections.reverse(list);
        
      
        return String.join("",list);
    }
}