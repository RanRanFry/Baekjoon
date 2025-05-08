class Solution {
    public int solution(int[][] sizes) {
       
        
        for(int [] si : sizes){
            if(si[0] < si[1]){
                int temp=si[0];
                si[0] = si[1];
                si[1] = temp;
            }
        }
        
         int widthMax =sizes[0][0];
        int heightMax =sizes[0][1];
        
        for (int i=0; i<sizes.length; i++){
            if(widthMax < sizes[i][0] ){
                widthMax = sizes[i][0];
            }            
        }
        
        for (int j=0; j<sizes.length; j++){
            if(heightMax < sizes[j][1] ){
                heightMax = sizes[j][1];
            }            
        }
        
        
        return widthMax * heightMax;
    }
}