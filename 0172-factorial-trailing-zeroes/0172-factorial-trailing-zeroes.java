class Solution {
    public int trailingZeroes(int n) {
        return result(n);
    }

    private int result(int InN){
        int count = 0;

        while(InN >= 5){
            count += (InN/5);
            InN /= 5;
        }

        return count;
    }
}

// 5! = 120
// 6! = 120 * 6 = 720
// 7! = 720 * 7 = 5040
// 8! = 5040 * 8 = 40320
// 9! = 40320 * 9 = 362880
// 10! = 362880 * 10 = 3628800
// 15! = 1307674368000
// 20! = 2432902008176640000
