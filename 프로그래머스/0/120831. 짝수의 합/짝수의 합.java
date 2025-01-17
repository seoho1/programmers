class Solution {
    public int solution(int n) {                
        
        
        if (n == 1 || n == 0 ){
                    return 0;
                }
        int sum = 0;
        for(int i = 0; i <= n; i += 2){
            sum += i;
            
        }
        return sum;
    }
}