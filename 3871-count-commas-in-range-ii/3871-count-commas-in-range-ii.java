class Solution {
    public long countCommas(long n) {
        return result(n);
    }

    private long result(long InN){
        long answer = 0;
        long b = 1000;

        while(InN>=b){
            answer += (InN - b + 1);
            b *= 1000;
        }

        return answer;
    }
}

// 입력값 - 1000^n + 1