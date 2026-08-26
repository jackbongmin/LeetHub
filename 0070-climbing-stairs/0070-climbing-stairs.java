class Solution {
    public int climbStairs(int n) {
        return result(n);
   }

    private static int result(int InN){
        
        if(InN == 1) return 1;
        if(InN == 2) return 2;

        int prev2 = 1;
        int prev1 = 2;
        int current = 0;

        for(int i = 3; i<= InN; i++){
            current = prev1 + prev2;

            prev2 = prev1;
            prev1 = current;

        }
        return current;
    }
}