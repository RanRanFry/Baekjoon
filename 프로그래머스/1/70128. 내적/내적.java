class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int innerProduct=0;
        for(int i=0; i<a.length; i++){
            innerProduct += a[i] * b[i];
        }
        return answer =innerProduct;
    }
}