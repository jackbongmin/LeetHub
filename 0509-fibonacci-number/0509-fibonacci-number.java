class Solution {
    public int fib(int n) {
        return result(n);
    }

    private static int result(int InN){
        
        if(InN <= 1) return InN;

        int f1 = 0;
        int f2 = 1;
        int current = 0;

        for(int i = 2; i<= InN; i++){
            current = f1 + f2;

            f1 = f2;
            f2 = current;
        }

        return current;
    }
}