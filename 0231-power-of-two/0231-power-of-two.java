class Solution {
    public boolean isPowerOfTwo(int n) {
        return result(n);
    }

    private static boolean result(int InN){

        if(InN <= 0) return false;
        if(InN == 1) return true;
        if(InN % 2 != 0) return false;
        return result(InN/2);
    }
}