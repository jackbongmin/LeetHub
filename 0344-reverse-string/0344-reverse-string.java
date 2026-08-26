class Solution {
    public void reverseString(char[] s) {
        result(s, 0, s.length -1);
        
    }
    private static void result(char[] InS, int InLeft, int InRight){
        if(InLeft >= InRight) return;

        char t = InS[InLeft];
        InS[InLeft] = InS[InRight];
        InS[InRight] = t;

        result(InS, InLeft + 1, InRight -1);
    }
}