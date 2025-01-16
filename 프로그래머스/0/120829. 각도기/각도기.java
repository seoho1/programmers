class Solution {
    public int solution(int angle) {
        
        if(angle < 90) {
            return 1;
        } else if(angle == 90){
            return 2;
        } else if(90 < angle && angle < 180) {
            return 3;
        } else if(180 == angle ) {
            return 4;
        }   return 10;         
    } 
}